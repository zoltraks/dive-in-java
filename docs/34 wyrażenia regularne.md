Wyrażenia regularne
===================

Wyrażeniami regularnymi nazywa się wzorce używane do dopasowań kombinacji znaków w łańcuchach tekstowych.

Wyrażenia regularne służą nie tylko do określenia, czy tekst pasuje do wozrca,
lecz pozwalają również na wydzielenie poszczególnych jego części.

Wyrażeń regularnych używa się do dopasowania i ekstrakcji danych (match), ale także zamiany ciągów tekstowych na inne (replacement).  

Wyrażenie regularne jest dopasowane od lewej do prawej. Znaki wzorca są kolejno "konsumowane". Po dopasowaniu, reszta tekstu od miejsca dopasowania podlega kolejnemu sprawdzeniu. Oznacza to że dla wzorca "aba" w tekście "ababababa" ciąg "aba" zostanie dopasowany dokładnie dwa razy: "**aba**b**aba**ba".

Wzorzec dopasowania składa się ze znaków dopasowania oraz specjalnych sekwencji określających klasy znaków, grupy dopasowań, znaki specjalne czy ograniczniki tekstu.

Symbole
-------

W ciągu wzorca mogą wystąpić znaki mające specjalne znaczenie.

| | |
|-|-|
| ``.`` | Dowolny znak |
| ``^`` | Początek tekstu (lub linii) |
| ``$`` | Koniec tekstu (lub linii) |
| ``[`` ``]`` | Klasa znaków (patrz niżej) |
| ``(`` ``)`` | Grupa dopasowania (patrz niżej) |
| ``\|`` | Alternatywa |

Aby dopasować w tekście znak specjalny jako zwykły, należy poprzedzić go znakiem odwrotnego ukośnika (backslash) ``\``. Sekwencja ``\.`` oznaczać będzie dopasowanie do znaku kropki, a nie dowolnego znaku.

### Przykład

``abcaaabbbccc``

| Wzorzec | Wynik |
|-|-|
| ``a.(b\|c)`` | ``abc`` ``aab`` |
| ``ab\|bc\|ca`` | ``ab`` ``ca`` ``ab`` ``bc`` |

Kwantyfikatory
--------------

Kwantyfikatorami nazywa się specjalne znaki określające jak często element poprzedzający kwantyfikator powinien wystąpić w dopasowaniu.

| | |
|-|-|
| ``*`` | Brak lub więcej wystąpień |
| ``+`` | Jedno lub więcej wystąpień |
| ``{3}`` | Dokładne trzy wystąpienia |
| ``{2,3}`` | Co najmniej dwa i maksymalnie trzy wystąpienia |
| ``{2,}`` | Co najmniej dwa wystąpienia |
| ``?`` | Jedno wystąpienie lub brak |

Domyślnie wyrażenia regularne działają w sposób zachłanny aby dopasować jak najwięcej elementów. Można po kwantyfikatorze dodać znak zapytania ``?`` aby zmienić to zachowanie na niezachłanne.

| | |
|-|-|
| ``+?`` | Co najmniej jedno wystąpienie, najmniej jak to możliwe |
| ``*?`` | Zero lub więcej wystąpień, najmniej jak to możliwe |

### Przykład

``aaa11bab``

| Wzorzec | Wynik |
|-|-|
| ``a+`` | ``aaa`` ``a`` |
| ``a{2}`` | ``aa`` |
| ``a{2,3}`` | ``aaa`` |
| ``a{2,3}?`` | ``aa`` |
| ``a{1,2}`` | ``aa`` ``a`` ``a`` |
| ``a+1?`` | ``aaa1`` ``a`` |
| ``a+?1?`` | ``a`` ``a`` ``a1`` ``a`` |

Klasy znaków
------------

Klasy znaków określają listę alternatyw. Umieszcza się je w nawiasach kwadratowych.
Przykładowo ``[abc]`` określa dopasowanie do znaku ``a``, ``b`` lub ``c``.
Dopuszczone jest stosowanie zakresu znaków, np. ``[0-3]`` odpowiada definicji ``[0123]`` i pozwala na dopasowanie znaku do cyfry ``0``, ``1``, ``2`` lub ``3``.
Dodatkowo jeśli za znakiem nawiasu otwierającego doda się znak ``^``, będzie to oznaczać negację klasy (znaki nie pasujące do zakresu). Znak minus ma specjalne znaczenie, ale można umieścić go jako ostatni znak bądź poprzedzić znakiem odwrotnego ukośnika jeśli zależy nam na włączeniu tego znaku do klasy.

Można także określić podklasę wykluczającą. Dla przykładu zapis ``[0-9-[3-5]]`` określa dopasowanie znaku z klasy cyfr od ``0`` do ``9`` ale z wyłączeniem ``3``, ``4`` oraz ``5``.

### Przykład

``0x01543ab34e10``

| Wzorzec | Wynik |
|-|-|
| ``[01]+`` | ``0`` ``01`` ``10`` |
| ``[04]+`` | ``0`` ``01`` ``43`` ``34`` ``10`` |
| ``0x[0-9]+`` | ``0x01543ab34e10`` |
| ``[0-9a-f]+`` | ``0`` ``01543ab34e10`` |
| ``[0-9a-f]+$`` | ``01543ab34e10`` |
| ``0(?!x)[0-9a-f]+`` | ``01543ab34e10`` |
| ``[^0-9]+`` | ``x`` ``ab`` ``e`` |
| ``[^0-4]+`` | ``x`` ``5`` ``ab`` ``e`` |

Znaki specjalne
---------------

| | |
|-|-|
| ``\n`` | Znak końca lini |
| ``\r`` | Znak powrotu karetki |
| ``\t`` | Znak tabulacji |
| ``\u`` ... | Kod znaku Unicode |

Znaki mające specjalne znaczenie można poprzedzić znakiem odwrotnego ukośnika aby był potraktowany jak zwykły znak występujący w łańcuchu.

| | |
|-|-|
| ``\\`` | Znak odwrotnego ukośnika |
| ``\(`` | Znak otwierającego nawiasu okrągłego |
| ``\[`` | Znak otwierającego nawiasu kwadratowego |
| ``\{`` | Znak otwierającego nawiasu klamrowego |
| ``\.`` | Znak kropki |
| ``\.`` | Znak kropki |

Meta znaki
----------

Meta znaki są to specjalne sekwencje będące skróconym zapisem często używanych konstrukcji klas lub znaków specjalnych.

| | |
|-|-|
| ``\d`` | Cyfra ``[0-9]`` |
| ``\b`` | Granica słowa |
| ``\s`` | Biały znak |
| ``\S`` | Niebiały znak |
| ``\w`` | Znak będący częścią słowa |
| ``\W`` | Znak niebędący częścią słowa |

Grupy dopasowań
---------------

Grupy umożliwiają wydzielenie poszczególnych części łańcucha lub określenie powtarzających się ciągów we wzorcu dopasowania. Grupy definiowane są w nawiasach okrągłych. Po znaku nawiasu otwierającego można dodać specjalne kwantyfikatory określające dodatkowe opcje grupy.

| | |
|-|-|
| ``(`` ``)`` | Grupa dopasowująca |
| ``(?:`` ``)`` | Grupa nieprzechwytująca |
| ``(?!`` ``)`` | Grupa wykluczająca |
| ``(?<nazwa>`` ``)`` | Grupa nazwana |

Użycie wyrażeń regularnych
==========================

```java
public class Main {

    public static void main(String[] args) {
        String input = "abcdef abc";
        String expression = "[b-d]+";
        Pattern pattern = Pattern.compile(expression);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            System.out.printf("%d : %d = %s%n", matcher.start(), matcher.end(), matcher.group());
        }
    }

}
```

```
1 : 4 = bcd
8 : 10 = bc
```
