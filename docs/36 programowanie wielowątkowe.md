# Programowanie wielowątkowe

Do obsługi wielu wątków w środowisku Java służy klasa ``Thread``.

Wątki działają współbieżnie w obrębie tego samego procesu i mają dzięki temu dostęp do jego przestrzeni adresowej.

Ma to jednak specjalne konsekwencje. Kod działający w obrębie innego wątku może działać na innym fizycznie procesorze CPU, tym samym dostęp do wspólnych danych odbywa się poprzez kopie w pamięci podręcznej CPU. Może się zdarzyć, że dane zmodyfikowane przez jeden wątek są niewidoczne dla drugiego.

Innym problemem z jakim się można spotkać jest przypadek nadpisywania wartości przez działające w tym czasie różne wątki. Dla przykładu można wyobrazić sobie funkcję zwiększania wartości zmiennej o 1. Algorytm działania takiej funkcji to:

  1. Pobierz wartość zmiennej (np. "3")
  2. Zwiększ wartość o 1 (wartość "4")
  3. Zapisz wartość zmiennej (wartość "4" zapisana do zmiennej)

W przypadku dwóch działających współbieżnie wątków może dojść do sytuacji:

  1. Wątek 1: pobierz wartość zmiennej ("3")
  2. Wątek 2: pobierz wartość zmiennej ("3")
  3. Wątek 1: Zwiększ wartość o 1 (wartość "4")
  4. Wątek 2: Zwiększ wartość o 1 (wartość "4")
  5. Wątek 1: Zapisz wartość zmiennej (wartość "4" zapisana do zmiennej)
  6. Wątek 2: Zapisz wartość zmiennej (wartość "4" zapisana do zmiennej)

W powyższym przykładzie widać, że mimo wywołania funkcji dwukrotnie wartość końcowa była nieprawidłowa, gdyż wątek 2 pobrał wartość zmiennej zanim wątek 1 zapisał wynik swojego obliczenia.

Aby uniknąć takich sytuacji stosuje się różne techniki synchronizacji takie jak semafory lub sekcje krytyczne.

## Thread

Klasa reprezentująca wątek może bezpośrednio dziedziczyć po klasie ``Thread`` przeładowując metodę ``run``.

Klasa ``Thread`` stanowi pełną reprezentację wątku w środowisku uruchomieniowym. Klasa ta oprócz metody ``run`` zawiera również metodę ``start`` oraz logikę związaną z zarządzaniem wieloma wystąpieniami wątków.

Wątek uruchamia się metodą ``start``.

```java
public class ThreadExample extends Thread {
    @Override
    public void run() {

    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        Thread thread = new ThreadExample();
        thread.start(); // starting thread
    }
}
```

## Runnable

Interfejs ``Runnable`` stanowi alternatywny sposób definiowania wątku. Zawiera on jedynie metodę ``run`` i jest "lżejszą" alternatywą dla klasy ``Thread``.

```java
public class RunnableExample implements Runnable {
    @Override
    public void run() {

    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new RunnableExample());
        thread.start(); // starting thread
    }
}
```

## Synchronizacja

Poniższy przykład obejmuje zagrożenie ze strony braku synchronizacji.

Kod przykładowego wątku ma za zadanie wykonać 100 razy zwiększenie wartości globalnej wartości o 1. Uruchamiając dwa wątki niezależnie spodziewany wynik to 200.

```java
public class Global {
    public static int value;
}
```

```java
public class ThreadExample extends Thread {
    @Override
    public void run() {
        System.out.printf("Starting thread %d%n", Thread.currentThread().getId());
        try {
            for (int i = 0; i < 100; i++) {
                int value = Global.value;
                Thread.sleep(1);
                value += 1;
                Global.value = value;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("Finishing thread %d%n", Thread.currentThread().getId());
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        Thread t1 = new ThreadExample();
        Thread t2 = new ThreadExample();
        t1.start();
        t2.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("Output value: %d", Global.value);
    }
}
```

Ponieważ nie zastosowano żadnego mechanizmu synchronizacji, wartość końcowa została wyznaczona nieprawidłowo.

```
Starting thread 16
Starting thread 15
Finishing thread 16
Finishing thread 15
Output value: 101
```

W celu synchronizacji możemy wykorzystać słowo kluczowe ``synchronized``.
W tym celu tworzy się obiekt "synchronizacyjny" pełniący rolę blokady.

```java
public class Global {
    public static int value;
    public static final Object lock = new Object();
}
```

Następnie operację inkrementacji umieszczamy w bloku synchronizowanym.

```java
public class ThreadExample extends Thread {
    @Override
    public void run() {
        System.out.printf("Starting thread %d%n", Thread.currentThread().getId());
        try {
            for (int i = 0; i < 100; i++) {
                synchronized (Global.lock) {
                    int value = Global.value;
                    Thread.sleep(1);
                    value += 1;
                    Global.value = value;
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("Finishing thread %d%n", Thread.currentThread().getId());
    }
}
```

Teraz program zadziała prawidłowo.

```
Starting thread 16
Starting thread 15
Finishing thread 16
Finishing thread 15
Output value: 200
```

## Semaphore

Klasa ``Semaphore`` reprezentuje obiekt umożliwiający kontrolę dostępu podobnie jak w przypadku mechanizmu synchronizacji z tą jednak różnicą, że można określić maksymalną ilość "żądań blokady".

Obiekt semafora udostępnia dwie użyteczne metody ``acquire`` oraz ``release``.

## SwingWorker

Klasa ``SwingWorker`` umożliwia stworzenie wątku działającego w tle w metodzie ``doInBackground`` i który po wykonaniu zadania może przekazać wyniki w metodzie ``done``.

## Interkomunikacja

Aby umożliwić wykonanie w kodzie wykonywanym w innym wątku przekazanie np. wyniku operacji, należy wybudować mechanizm interkomunikacji między wątkami. Można by oczywiście użyć obiektów dostępnych globalnie, ale lepszym rozwiązaniem jest przekazanie do obiektu reprezentującego wątek obiektu zawierającego zewnętrzną funkcjonalność do której może odwołać się wątek.

Realizuje się to zwykle przy pomocy interfejsów obiektowych jak w poniższym przykładzie.

```java
public interface OnCompletedListener {
    void onCompleted();
}
```

```java
public class BackgroundThread implements Runnable {

    private final OnCompletedListener listener;

    public BackgroundThread(OnCompletedListener listener) {
        this.listener = listener;
    }

    @Override
    public void run() {
        System.out.printf("Starting thread %d%n", Thread.currentThread().getId());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("Finishing thread %d%n", Thread.currentThread().getId());
        if (listener != null) {
            listener.onCompleted();
        }
    }

}
```

```java
public class Main {
    public static void main(String[] args) {
        OnCompletedListener o = new OnCompletedListener() {
            @Override
            public synchronized void onCompleted() {
                System.out.printf("Completed thread %d%n", Thread.currentThread().getId());
            }
        };
        Thread t1 = new Thread(new BackgroundThread(o));
        t1.start();
        Thread t2 = new Thread(new BackgroundThread(o));
        t2.start();
    }
}
```

Należy zauważyć, że kod przekazany obiektem ``o`` w powyższym przykładzie działa nadal w kontekście wątku, który go wywołuje.

```
Starting thread 16
Starting thread 15
Finishing thread 16
Finishing thread 15
Completed thread 15
Completed thread 16
```
