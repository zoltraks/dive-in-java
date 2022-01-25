Inne komponenty
===============

Klasa zegara
------------

W bibliotece **Swing** zdefiniowana jest klasa ``Timer`` umożliwiająca wywołanie zdarzenia po upływie określonego czasu.

Aby utworzyć obiekt zegara, należy użyć konstruktora przyjmującego dwa parametry: opóźnienia podanego w milisekundach oraz obiektu implementującego ``ActionListener``. Uruchomienie odliczania następuje po wykonaniu metody ``start`` obiektu klasy ``Timer``.

Aby wyłączyć odliczanie należy użyć metody ``setRepeats`` z parametrem ``false``. Zmianę interwału można wykonać metodą ``setDelay``.

https://docs.oracle.com/javase/tutorial/uiswing/misc/timer.html
