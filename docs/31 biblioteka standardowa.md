# Biblioteka standardowa

## ``Object``

```java
public boolean equals(Object obj)
```

Metoda zwraca wartość ``true`` jeśli obiekty są sobie równoważne.

```java
public int hashCode()
```

Ogólna zasada jest taka, że jeśli w metodzie ``equals()`` zwraca wartość ``true``, to dla obu porównywanych obiektów metoda ``hashCode()`` powinna zwrócić tę samą wartość.

As much as is reasonably practical, the hashCode method defined by class Object does return distinct integers for distinct objects. (This is typically implemented by converting the internal address of the object into an integer, but this implementation technique is not required by the JavaTM programming language.)

## ``String``

```java
public char charAt(int index)
```

Zwraca znak ciągu tekstowego na pozycji liczonej od zera.

Może wywołać wyjątek ``StringIndexOutOfBoundsException``.

```java
public static String format(@NotNull String format, @Nullable Object... args);
```

Formatowanie tekstu przy pomocy ciągu formatującego w stylu funkcji ``printf`` znanej z języka **C**.

## ``StringBuilder``

## ``StringBuffer``

## ``CharSequence``

## ``Math``

## ``ArrayList``

## ``LinkedList``

## ``HashMap``

## ``Thread``

## ``BigDecimal``

## ``Class``

## ``Runnable``

Interfejs przeznaczony dla klas, których instancje są przeznaczone do działania w wątku.

Składa się on tylko i wyłącznie z bezparametrowej metody ``run``, którą należy zaimplementować w klasie implementującej ten interfejs.

```java
public void run()
```

## ``Future<V>``

## ``System``

```
public static void exit(int status)
```

Zakończenie działania maszyny wirtualnej JVM.

Kod wyjścia powinien być ustawiony na niezerową wartość tylko w przypadku chęci zgłoszenia awarii procesu.

```
public static long nanoTime()
```

Zwraca bieżący czas w nanosekundach (miliardowa część sekundy).

```
public static String getProperty(String key)
```

Zwraca wartość dla określonej właściwości systemowej. Często używanymi właściwościami są "user.dir" zwracająca ścieżkę katalogu bieżącego, czy "user.home" zwracająca ścieżkę do katalogu domowego użytkownika.

https://docs.oracle.com/javase/tutorial/essential/environment/sysprop.html

## ``Runtime``

Klasa reprezentująca środowisko uruchomieniowe w którym działa aplikacja.

Istnieje tylko jeden obiekt tej klasy na czas wykonania. Nie można tworzyć obiektów tej klasy.

```java
public static Runtime getRuntime()
```

Zwraca obiekt związany z aktualnym środowiskiem uruchomieniowym w którym działa aplikacja.

## ``Toolkit``

## ``WindowEvent``
