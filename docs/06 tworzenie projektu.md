Tworzenie projektu
==================

Aby rozpocząć pracę nad kodem źródłowym należy stworzyć nowy projekt lub zaimportować istniejący w środowisku zintegrowanym.

Powszechnie przyjętą konwencją jest umieszczanie projektu w katalogu będącym jednocześnie repozytorium systemu kontroli wersji (VCS).

Repozytoria Git są często nazywane zgodnie z konwencją "nazw internetowych", tj. słowa zaczynają się od litery i składają się tylko z małych liter oraz cyfr, zaś w nazwie oddzielane są znakiem minusa.

Przykłady nazw w konwencji internetowej: **my-first-project**, **project1-ui**.

Nazwy katalogów będącymi repozytoriami Git można pozostawić zgodnie z wymienoną wyżej konkwencją "nazw internetowych", ale nie jest to wymagane. Dobrze jest unikać znaku spacji, czy rozpoczynania słów od cyfry.

Przykłady nazw w innej konwencji: **MyFirstProject**, **ProjectUi**.

Eclipse
-------

### Nowy projekt

![](image/new-project/eclipse-01.png)

![](image/new-project/eclipse-02.png)

![](image/new-project/eclipse-03.png)

### Widok projektu

![](image/new-project/eclipse-04.png)

### Import projektu

![](image/new-project/eclipse-05.png)

![](image/new-project/eclipse-06.png)

### Sprawdzanie pisowni

![](image/new-project/eclipse-07.png)

---

NetBeans
--------

![](image/new-project/netbeans-01.png)

### Widok projektu

![](image/new-project/netbeans-04.png)

### Import projektu

![](image/new-project/netbeans-06.png)

### Wskazanie JDK podczas instalacji

![](image/new-project/netbeans-08.png)

### Aktywacja wymaganych funkcji

![](image/new-project/netbeans-09.png)

### Automatyczne rozwiązywanie problemów z projektem

![](image/new-project/netbeans-10.png)

### Zmiana JDK używanego przez NetBeans

Lokalizację JDK podaje się w kluczu ``netbeans_jdkhome`` w pliku konfiguracyjnym ``netbeans.conf``.

![](image/new-project/netbeans-11.png)

### Poprawna obsługa Unikodu

W pliku konfiguracyjnym ``netbeans.conf`` należy dodać poniższą opcję w kluczu konfiguracyjnym ``netbeans_default_options``.

```
-J-Dfile.encoding=UTF-8
```

![](image/new-project/netbeans-12.png)

---

IntelliJ IDEA
-------------

![](image/new-project/idea-07.png)

![](image/new-project/idea-01.png)

![](image/new-project/idea-02.png)

![](image/new-project/idea-03.png)

### Widok projektu

![](image/new-project/idea-04.png)

### Import projektu

![](image/new-project/idea-06.png)

### Wyłączenie agenta podczas debugowania

![](image/new-project/idea-05.png)
