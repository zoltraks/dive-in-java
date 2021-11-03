Klasy
=====

OOP - Object Oriented Programming - Programowanie zorientowane obiektowo

W przypadku języka Java OOP odnosi się do programowania obiektowego opartego o klasy.
W przeciwieństwie do programowania obiektowego opartego o prototypy.

Klasy można traktować jak szablony obiektów, gdzie obiekty to instancje swoich klas.

Klasy są sposobem na grupowanie obiektów.

Obiekty *jabłko*, *gruszka*, *banan* mogą należeć do klasy *owoców*.

Obiekty *Volvo*, *Audi*, *Toyota* mogą należeć do klasy *samochodów*.

Klasy mogą dziedziczyć po sobie i ten fakt jest wykorzystywany do programowania według modelu określającego hierarchię klas.

Hierarchia klas jest odpowiednikiem struktury drzewa, gdzie "korzeniem" jest klasa ``Object``.

```
+----------------------------------------------+
|   Samochód                                   |
+----------------------------------------------+
| - marka                 : String  {readOnly} |
| - model                 : String  {readOnly} |
| - rokProdukcji          : int     {readOnly} |
| - numerRejestracji      : String             |
| - przebieg              : long               |
+----------------------------------------------+
| + zwiększPrzebieg(long) : void               |
| + wiek(int)             : int                |
+----------------------------------------------+
```

Klasy składają się z atrybutów oraz
