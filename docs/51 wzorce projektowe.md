Wzorce projektowe
=================

## Dekorator

Klasa opakowująca inną klasę, po której dziedziczy. Umożliwia to dodanie nowej funkcjonalności lub rozszerzenie jej w sposób niemal przezroczysty dla kod korzystającego z tej klasy, bowiem instancje obiektu zachowują funkcjonalność klasy dziedziczonej.

Można także zdefiniować bazową klasę abstrakcyjną dla dekoratorów zawierającą pole prywatne będące instancją obiektu bazowego i konstruktor jednoparametrowy zawierający odwołanie do obiektu dekorowanego.

Dekoratory utworzone w taki sposób można ze sobą łączyć, dodając kolejne funkcjonalności.

## Kompozyt

Wzorzec strukturalny *GoF*.

Klasa zawierająca jeden bądź więcej obiektów, ale implementująca taki sam interfejs jak klasa bazowa, co umożliwia użycie kompozytu tak jakby był jednym obiektem.

https://en.wikipedia.org/wiki/Composite_pattern#Java

## Pyłek

Wzorzec strukturalny *GoF*.

Wzorzec projektowy mający na celu minimalizację zużycia zasobów poprzez współdzielenie części danych z innymi obiektami.

## Singleton

Wzorzec kreacyjny, którego zadaniem jest zapewnienie istnienia jednej i tylko jednej instancji danej klasy.

Singleton bywa uważany za antywzorzec projektowy.

## Dekorator

Wzorzec strukturalny *GoF*.

Zadaniem tego wzorca jest umożliwienie dodania nowej funkcjonalności do istniejących klas w trakcie działania programu.

Klasa dekoratora opakowuje oryginalną klasę poprzez dziedziczenie oraz zależność od obiektu dekorowanego.
Obiekt dekorowany przekazuje się w konstruktorze klasy dekoratora.
W prostym przypadku funkcje klasy bazowej w klasie dekoratora są przekazywane do obiektu dekorowanego.

Dzięki takiemu podejściu możliwe jest użycie wielu dekoratorów, obiekt dekoratora można przekazać jako obiekt dekorowany dla następnego dekoratora.

Umożliwia to dodanie lub zmianę funkcjonalności podobnie jak w przypadku statycznego dziedzicznia z tą różnicą, że może się to odbywać dynamicznie.

## Adapter

Wzorzec strukturalny *GoF*.

Klasa adaptera służy do udostępniania funkcjonalności istniejącej klasy poprzez implementację nowego interfejsu.

Spotyka się dwa rodzaje implementacji tego wzorca.
Implementacja klasowa polega na prywatnym dziedziczeniu po klasie adaptowanej i publicznej implementacji interfejsu.
Implementacja obiektowa polega na implementacji interfejsu oraz dodaniu zależności do obiektu klasy adaptowanej.

W implementacji klasowej funkcje klasy adaptowanej są zwykle wywoływane poprzez przekierowanie ich do klasy bazowej po której dziedziczy adapter.
W implementacji obiektowej funkcje klasy adaptowanej są przekazywane do obiektu tej klasy utworzonego w ramach obiektu adaptera.  

## Metoda wytwórcza

## Budowniczy

Wzorzec kreacyjny *GoF*.

## Fabryka

## Method chaining - Łańcuch wywołań

Tworzenie metod zwracających swój obiekt, co umożliwia użycie kilku metod obiektu jedna po drugiej.

## Fluent interface - Płynny interfejs

Autorami koncepcji są Eric Evans i Martin Fowler

## Strategia

Wzorzec behawioralny *GoF*.

Wydzielenie logiki związanej z jakąś czynnością i przeniesienie jej do innej klasy.

W klasie pierwotnej tworzony jest obiekt strategii, do którego oddelegowane zostaje konkretne działanie. Pozwala to na zmianę logiki poprzez przypisanie innego obiektu strategii w obiekcie pierwotnym.

## Prototyp

Implementowany w postaci interfejsu udostępniającego metodę klonowania.
Obiekt implementujący ten interfejs umożliwia stworzenie nowego obiektu, będącego kopią obiektu protopypowego, w kontekście którego wywoływana jest metoda.

## Connection Pooling - Pula połączeń

Wzorzec dostępu do danych, którego głównym celem jest zmniejszenie narzutu związanego z wykonywaniem i utrzymywaniem połączeń z bazą danych.

Przykładowy schemat działania

 * Otwarcie połączenia z bazą danych za pomocą sterownika bazy danych (JDBC)

 * Otwarcie gniazda TCP do odczytu i zapisu danych (Socket)

 * Inicjacja i autentykacja połączenia z serwerem bazy danych (SQL)

 * Odczyt i zapis danych przez gniazdo (SQL)

 * Zamykanie połączenia z serwerem bazy danych (SQL)

 * Zamykanie gniazda (Socket)
