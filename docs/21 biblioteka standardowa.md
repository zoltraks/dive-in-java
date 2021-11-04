# Klasy

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

```
public char charAt(int index)
```

Zwraca znak ciągu tekstowego na pozycji liczonej od zera.

Może wywołać wyjątek ``StringIndexOutOfBoundsException``.

## ``Math``

## ``StringBuilder``

## ``StringBuffer``

## ``HashMap``

## ``Thread``

## ``BigDecimal``

# Interfejsy

## ``Runnable``

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

## ``Runtime``
