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

## ``LocalDateTime``

Klasa służąca do reprezentacji daty oraz czasu.

```java
var now = LocalDateTime.now();
System.out.println(now);
```

## ``DateTimeFormatter``

Klasa służąca do obsługi formatu zapisu daty i czasu.

https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html

```java
var formatterFrom = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS");
var dt = LocalDateTime.parse("2021-11-01T09:51:33.507", formatterFrom);
System.out.println((int)(dt.getNano() / 1e6));
var formatterTo = DateTimeFormatter.ofPattern("dd.MM.yy HH:mm:ss");
var text = formatterTo.format(dt);
System.out.println(text);
```

## ``Math``

## ``ArrayList``

## ``LinkedList``

## ``HashMap``

## ``Arrays``

Klasa narzędziowa zawierająca funkcje działające na tablicach.

Przydatną funkcją jest ``asList()`` zwracająca kolekcję ``List<>`` zawierającą elementy podane w wywołaniu funkcji.

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

## ``File``

java.io

## ``FileReader``

## ``FileWriter``

## ``BufferedReader``

## ``BufferedWriter``

## ``Files``

java.nio.file

## ``Path``

java.nio.file

## ``FileStreamReader``

## ``FileStreamWriter``

## ``Toolkit``

## ``WindowEvent``
