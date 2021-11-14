Klasy i obiekty
===============

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
| + marka                 : String  {readOnly} |
| + model                 : String  {readOnly} |
| + rokProdukcji          : int     {readOnly} |
| + numerRejestracji      : String             |
| + przebieg              : long               |
+----------------------------------------------+
| + zwiększPrzebieg(long) : void               |
| + wiek(int)             : int                |
+----------------------------------------------+
```

Klasy są definicją struktury danych oraz funkcjonalności.

Klasy składają się więc z atrybutów (pól) oraz metod (funkcji).

Rozróżniamy dwa rodzaje pól oraz metod:

 - **statyczne**, nazywane polami oraz metodami klasy

 - **niestatyczne**, nazywane polami oraz metodami instancji

Metody statyczne działają bezkontekstowo, nie mają dostępu do niestatycznych pól klasy.
Aby użyć metody statycznej, należy odwołać się bezpośrednio do nazwy klasy.

Pola statyczne klasy są wspólne dla wszystkich obiektów.

Definicję statycznego pola lub metody poprzedza się słowem kluczowym ``static``.

Metody niestatyczne działają w kontekście instancji, do której jawnie odwołujemy się przy pomocy słowa ``this``.

Pola niestatyczne są cechą konkretnej instancji klasy. Każdy obiekt posiada swoje dane oddzielnie.

Modyfikatory dostępu
--------------------

Definiując klasy, pola oraz metody określamy ich "widoczność" stosując słowa kluczowe zwane modyfikatorami dostępu. Pola oraz metody są zawsze dostępne na poziomie klasy w której są zdefiniowane. Klasy są zawsze widoczne w obrębie tego samego pakietu.

| Dostęp | Słowo kluczowe | W obrębie pakietu | W podklasie poza pakietem | Wszędzie |
|-|-|-|-|-|
| domyślny | *brak* | TAK | NIE | NIE |   
| prywatny | ``private`` | NIE | NIE | NIE |   
| chroniony | ``protected`` | TAK | TAK | NIE |   
| publiczny | ``public`` | TAK | TAK | TAK |   

Domyślny dostęp nazywany jest także prywatnym dla pakietu (package-private).

Podczas dokumentowania w stylu zgodnym z **UML**, modyfikatory dostępu określamy znakiem poprzedzającym nazwę pola lub metody.

| | |
| - | - |
| ``+`` | ``public``    |
| ``-`` | ``private``   |
| ``#`` | ``protected`` |
| ``~`` | ``package``   |
