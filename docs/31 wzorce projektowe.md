Wzorce projektowe
=================

## Singleton

Wzorzec kreacyjny, którego zadaniem jest zapewnienie istnienia jednej i tylko jednej instancji danej klasy.

Singleton bywa uważany za antywzorzec projektowy.

## Kompozyt

## Fabryka

## Connection Pooling - Pula połączeń

Wzorzec dostępu do danych, którego głównym celem jest zmniejszenie narzutu związanego z wykonywaniem i utrzymywaniem połączeń z bazą danych.

Przykładowy schemat działania

 * Otwarcie połączenia z bazą danych za pomocą sterownika bazy danych (JDBC)

 * Otwarcie gniazda TCP do odczytu i zapisu danych (Socket)

 * Inicjacja i autentykacja połączenia z serwerem bazy danych (SQL)

 * Odczyt i zapis danych przez gniazdo (SQL)

 * Zamykanie połączenia z serwerem bazy danych (SQL)

 * Zamykanie gniazda (Socket)
