Zmienne
=======

Deklaracja zmiennej w języku Java odbywa się przez zapis w formacie:

```
typ_zmiennej nazwa_zmiennej = wartość zmiennej;
```

```java
String s = "Tekst";
int i = 123;
double d = 3.14;
```

W nowszych wersjach języka Java można użyć słowa kluczowego **var** zamiast jawnego typu o ile kompilator może określić ten typ podczas kompilacji.

```java
var s = "Tekst";
var i = 123;
var d = 3.14;
```

Nie jest możliwe natomiast zadeklarowanie zmiennej przy użyciu słowa kluczowego **var** bez podawania wartości na podstawie której kompilator może określić typ zmiennej.

Zmienne lokalne
---------------

Zmienne "istnieją" w zasięgu bloku, w którym zostały zadeklarowane i tylko tam.

Możliwe jest więc użycie tej samej nazwy dla różnych zmiennych o ile zdefiniowane są w różnych blokach.

Zmienne finalne
---------------

Jeśli zmienna nie może zmieniać swojej wartości, deklaruje się ją jako finalną.

Zmienne globalne
----------------

Zmienne zdefiniowane na zewnątrz bloku, np. jako pola w klasie, są dostępne dla wszystkich metod tej klasy.
