Typy danych
===========

Typy prymitywne
---------------

| Primitive type | Rozmiar  | Opis                                                                        |
| -------------- | -------- | --------------------------------------------------------------------------- |
| ``byte``       | 1 bajt   | Liczba całkowita od -128 do 127                                             |
| ``short``      | 2 bajty  | Liczba całkowita od -32 768 do 32 767                                       |
| ``int``        | 4 bajty  | Liczba całkowita od -2 147 483 648 do 2 147 483 647                         |
| ``long``       | 8 bajtow | Liczba całkowita od -9,223,372,036,854,775,808 do 9,223,372,036,854,775,807 |
| ``float``      | 4 bajty  | Liczba rzeczywista (6-7 cyfr znaczących)                                    |
| ``double``     | 8 bajtow | Liczba rzeczywista (15 cyfr znaczących)                                     |
| ``boolean``    | 1 bit    | Wartość logiczna ``true`` lub ``false``                                     |
| ``char``       | 2 bajty  | Pojedynczy znak (niektóre sekwencje unikodu składają się z dwóch znaków)    |

Klasy opakowujące
-----------------

| Primitive type  | Wrapper class |
| --------------- | ------------- |
| ``byte``        | ``Byte``      |
| ``short``       | ``Short``     |
| ``int``         | ``Integer``   |
| ``long``        | ``Long``      |
| ``float``       | ``Float``     |
| ``double``      | ``Double``    |
| ``char``        | ``Character`` |
| ``boolean``     | ``Boolean``   |

Rzutowanie rozszerzające
------------------------

Jest to rodzaj konwersji między różnymi typami danych, gdzie typ wynikowy jest większej dokładności.

``byte`` -> ``short`` -> ``char`` -> ``int`` -> ``long`` -> ``float`` -> ``double``

Ten rodzaj konwersji jest automatyczny, tzn. nie ma konieczności używania jawnie operatora rzutowania bądź konwersji.

```java
int i = 9;
double d = i;
```

Rzutowanie zawężające
---------------------

Ten rodzaj konwersji jest związany z możliwością utraty dokładności lub wystąpieniem wyjątku, gdyż typ wynikowy jest mniejszej dokładonści.
