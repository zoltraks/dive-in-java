Ćwiczenia
=========

Lab 01
------

Nowy projekt, zbudowanie go i uruchomienie w środowisku programistycznym.

Podstawowe informacje na temat pracy w środowisku zintegrowanym.

Lab 02
------

Podstawy tworzenia klas.


Klasa bazowa: ``Person``

Klasa składowa: ``Address``

Klasy pochodne:

 - ``Customer``

 - ``Employee``

 - ``Student``

 - ``Teacher``

Klasa bazowa: ``Animal``

Klasy pochodne:

 - ``Cat``

 - ``Dog``

Klasa bazowa: ``Vehicle``

Klasy pochodne:

- ``Car``

- ``Truck``

- ``Train``

Lab 03
------

Dziedziczenie oraz interfejsy.

Korzystanie z obiektów posługując się interfejsami lub klasami abstrakcyjnymi.

Użycie klas specjalizowanych, list oraz map.

Rodzina artykułów spożywczych.

Klasa bazowa produktu ``Product``.

Interfejs ``Eatable``

Klasa pochodna owocu ``Fruit`` implementująca interfejs ``Eatable``

Klasa pochodna warzywa ``Vegetable`` implementująca interfejs ``Eatable``

Lab 04
------

Projekt realizujący porównanie kilku podstawowych algorytmów obliczeniowych.

Program powinien wyświetlić winietę (informację początkową), a następnie umożliwić wybór algorytmu obliczeniowego.

Po wybraniu algorytmu program powinien pozwolić na wprowadzenie parametrów dla algorytmu.

Przykładowe algorytmy:

 - potęgowanie metodą iteracji

 - potęgowanie metodą rekurencji

 - silnia metodą interacji

 - silnia metodą rekurencji

 - ciąg Fibonacciego metodą iteracji

 - ciąg Fibonacciego metodą rekurencji

 - algorytm Euklidesa (największy wspólny dzielnik)


Lab 05
------

Pliki

Odczyt istniejącego pliku, zapis nowego pliku.

### Zadanie 1

Program zliczający wystąpienia cyfr, liter oraz słów.

Korzystając z ``System.getProperty()`` program powinien wypisać bieżącą ścieżkę roboczą.

Program powinien pobrać ścieżkę dostępu do pliku z pierwszego argumentu uruchomienia i wypisać ją.

Następnie powinien odczytać plik i zliczyć wystąpienia cyfr, liter oraz słów. Należy przyjąć, że słowo to ciąg składający się z co najmniej jednego *niebiałego* znaku. Wyniki należy wypisać.

Plik testowy należy zapisać w katalogu roboczym programu.

```
Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam facilisis sit amet mi ac vestibulum. Vestibulum convallis odio at cursus facilisis. Vivamus ultrices velit in arcu ornare, ut mollis tortor blandit. Nulla facilisi. Nulla placerat feugiat ipsum, eget faucibus risus scelerisque rutrum. Mauris in orci ex. Praesent ornare mauris id sodales viverra.

127.0.0.1 2021 11 25

Donec laoreet sagittis mollis. Nunc suscipit libero ut enim dapibus, et malesuada lectus mattis. Nunc maximus pharetra gravida. In vitae tortor justo. In mi nisi, euismod sit amet nunc et, interdum ullamcorper elit. Mauris tempor purus vel nisl vehicula tincidunt.
```

### Zadanie 2

Program zapisujący do pliku bieżącą datę oraz czas z opcjonalnym przesunięciem podanym w argumencie uruchomienia jako ilość dni w przyszłość lub wstecz dla wartości ujemnych.

Nazwa pliku wyjściowego powinna być podana w pierwszym parametrze uruchomienia. Opcjonalne przesunięcie powinno być pobrane z drugiego parametru uruchomienia.

Lab 06
------

Podstawy tworzenia graficznego interfejsu użytkownika przy użyciu komponentów biblioteki ``Swing``.

### Zadanie 1

Utworzenie klasy okna aplikacji przy użyciu kreatora.

### Zadanie 2

Utworzenie klasy okna aplikacji programowo.

Lab 07
------

### Zadanie 1

Programowe utworzenie i wyświetlenie okna logowania się do aplikacji.
Okno powinno być wyświetlone na środku ekranu, zawierać etykietki "Użytkownik" oraz "Hasło" wraz z polami edycyjnymi oraz przyciski "Ok", "Zamknij".
Przycisk "Ok" powinien być aktywny tylko w przypadku obu wypełnionych pól.
Przycisk "Zamknij" powinien zakończyć działanie programu.

### Zadanie 2

Programowe utworzenie okna aplikacji, użycie klasy ``Timer`` oraz dodanie obsługi zdarzenia wyświetlenia okna.

Należy utworzyć klasę okna w którym znajdzie się etykietka tekstowa oraz przycisk. Naciśnięcie przycisku powinno spowodować zamknięcie okna. Po wyświetleniu okna należy rozpocząć odliczanie i wyświetlać kolejne wartości w etykietce. Po osiągnięciu minimalnej wartości należy zatrzymać odliczanie.

![](image/shot/shot-3051.png)

![](image/shot/shot-3052.png)

Lab 08
------

Wyświetlanie sekwencji obrazków umieszczonych w zasobach aplikacji.

Lab 09
------

Tworzenie własnych komponentów.

Lab 11
------

Połączenia sieciowe.

### Zadanie 1

Wykonać połączenie do API pod URL http://api.zpsb.alyx.pl/ i pobrać wynik w formie tekstowej.

Wyciągnąć z tekstu znacznik czasowy "Time: RRRR-MM-DD gg:mm:ss" i wyświetlić go.

Lab 12
------

Wątki.

### Zadanie 1

Utworzyć wątek roboczy implementujący interfejs ``Runnable`` i wykonujący pewne długotrwałe obliczenia.

Wątek roboczy powinien znać nadaną sobie nazwę i posłużyć się nią do wyświetlenia informacji o uruchomieniu oraz zakończeniu pracy.

Program powinien zapytać użytkownika o ilość wątków.

Zadanie polega na uruchomieniu tych wątków i zakończeniu programu po zakończeniu działania wszystkich wątków.

Lab 12
------

Logowanie do dziennika.

Lab 13
------

Baza danych.

Lab 14
------

Algorytm Dijkstry.

Lab 15
------

Algorytm A*.
