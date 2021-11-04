Struktura programu
==================

Przykład
--------

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

Plik źródłowy Javy składa się z następujących sekcji:

 - określenie pakietu ``package``

 - importowanie klas z innych pakietów ``import``

 - definicja klasy

Komentarze
----------

Komentarze jednoliniowe zaczynają się od podwójnego znaku ukośnika ``//``.
Kompilator ignoruje tekst komentarza aż do następnej linii.

Komentarze wieloliniowe zaczynają się od znaku ukośnika oraz gwiazdki ``/*`` i kończą się sekwencją odwrotną, tj. ``*/``.
Kompilator ignoruje wszystkie linie komentarza.

Komentarze dokumentujące to specjalny format komentarza wieloliniowego rozpoznawanego przez środowisko zintegrowane.

Zmienne
-------
