Struktura programu
==================

Program wyświetlający tekst powitalny.

```java
package org.example.hello;

public class Main {

    /**
     * Main entry point
     *
     * @param args Optional command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

}
```

Nieco rozbudowany przykład programu wyświetlającego czas bieżący w określonym formacie.

```java
package com.company.play;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    /**
     * Klasa przechowująca czas utworzenia
     */
    private static final class Now {

        private final LocalDateTime dt;
        private final DateTimeFormatter df;

        /**
         * Konstruktor
         */
        public Now() {
            dt = LocalDateTime.now();
            df = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
        }

        /**
         * Wyświetl czas utworzenia
         */
        public void print() {
            String s = df.format(dt); // format czasu
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        var now = new Now();
        now.print();
    }

}
```

Opis
----

Plik źródłowy Javy składa się z następujących sekcji:

 - określenie pakietu ``package``

 - importowanie klas z innych pakietów ``import``

 - definicja klasy ``class``

Definicja klasy obejmuje definicje atrybutów (pól) oraz metod (funkcjonalności).

Komentarze
----------

Komentarze jednoliniowe zaczynają się od podwójnego znaku ukośnika ``//``.
Kompilator ignoruje tekst komentarza aż do następnej linii.

Komentarze wieloliniowe zaczynają się od znaku ukośnika oraz gwiazdki ``/*`` i kończą się sekwencją odwrotną, tj. ``*/``.
Kompilator ignoruje wszystkie linie komentarza.

Komentarze dokumentujące to specjalny format komentarza wieloliniowego rozpoznawanego przez środowisko zintegrowane.

Importowanie
------------

Importowanie umożliwia użycie nazw klas bez konieczności podawania pełnej ścieżki zawierającej pakiet w którym klasa jest zdefiniowana.
