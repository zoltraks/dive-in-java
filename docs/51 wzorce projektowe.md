Wzorce projektowe
=================

## Dekorator

Klasa opakowująca inną klasę, po której dziedziczy. Umożliwia to dodanie nowej funkcjonalności lub rozszerzenie jej w sposób niemal przezroczysty dla kod korzystającego z tej klasy, bowiem instancje obiektu zachowują funkcjonalność klasy dziedziczonej.

Można także zdefiniować bazową klasę abstrakcyjną dla dekoratorów zawierającą pole prywatne będące instancją obiektu bazowego i konstruktor jednoparametrowy zawierający odwołanie do obiektu dekorowanego.

Dekoratory utworzone w taki sposób można ze sobą łączyć, dodając kolejne funkcjonalności.

## Kompozyt

Wzorzec strukturalny *GoF*.

## Pyłek

Wzorzec strukturalny *GoF*.

Wzorzec projektowy mający na celu minimalizację zużycia zasobów poprzez współdzielenie części danych z innymi obiektami.

## Singleton

Wzorzec kreacyjny, którego zadaniem jest zapewnienie istnienia jednej i tylko jednej instancji danej klasy.

Singleton bywa uważany za antywzorzec projektowy.

## Kompozyt

## Fabryka

## Method chaining - Łańcuch wywołań

Tworzenie metod zwracających swój obiekt, co umożliwia użycie kilku metod obiektu jedna po drugiej.

## Fluent interface - Płynny interfejs

Wzorzec

Autorami koncepcji są Eric Evans i Martin Fowler

https://depl.abcdef.wiki/wiki/Fluent_Interface

## Budowniczy

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
