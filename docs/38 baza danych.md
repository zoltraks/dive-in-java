# Baza danych

Język ``Java`` zawiera API służące do połączeń z relacyjnymi bazami danych o nazwie ``JDBC`` (Java Database Connectivity) w pakiecie ``java.sql``.

JDBC stanowi wartwę pośredniczącą pomiędzy sterownikiem klienta bazy danych, a kodem programu. Połączenie z bazą danych jest reprezentowane przez klasę ``Connection``. Do wykonywania zapytań i operacji w języku ``SQL`` służy klasa ``Statement``. 

# ORMLite

https://ormlite.com/

Biblioteka ``ORMLite`` umożliwia dostęp do bazy danych z użyciem techniki ORM (Object–relational mapping).

Technika ta polega na tym, że dla struktur danych przechowywanych w bazie danych tworzy się odpowiadające im klasy w języku ``Java``.

Poszczególne atrybuty klasy uzupełnia się adnotacjami określającymi specyficzne właściwości po stronie struktur w bazie danych.

Biblioteka ``ORMLite`` umożliwia automatyczne wybieranie i wprowadzanie danych przy pomocy reprezentacji ich w formie obiektów natywnych dla języka programowania.
