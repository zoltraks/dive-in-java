Zadanie zaliczeniowe
====================

1. Utworzyć publiczne repozytorium projektu na platformie GitHub lub podobnej. Należy wybrać odpowiedni identyfikator dla projektu oraz prefiks przestrzeni nazw. Jako prefiks nazwy pakietu można użyć swojej nazwy użytkownika, np. **org.jkowalski**.

2. Utworzyć projekt w środowisku **IntelliJ IDEA** ze strukturą folderów kodu źródłowego zgodnie z odpowiednią konwencją. Kod źródłowy umieszcza się w katalogu **src**. Należy uwzględnić foldery dla kodu źródłowego aplikacji **src/main/java**, zasobów **src/main/resources**, kodu źródłowego testów **src/test/java** oraz zasobów dla testów **src/test/resources**. W przypadku projektu zawierającego jeden moduł, katalog **src** powinien znajdować się w katalogu głównym. W przypadku projektu wielomodułowego, należy utworzyć oddzielnie struktury dla każdego z modułów w katalogu głównym repozytorium i w obrębie każdego z nich folder **src** z analogiczną strukturą.

3. W katalogu głównym reporzytorium należy umieścić plik tekstowy w formacie [Markdown](https://www.markdownguide.org/basic-syntax/) o nazwie **README.md** zawierający opis repozytorium. Opis ten powinien zawierać informację o aplikacji, opis instalacji i uruchomienia oraz sposobie użycia. Opcjonalnie można utworzyć folder dokumentacji projektu w katalogu **docs**. Obrazki i inne zasoby dokumentacji powinny znajdować się w obrębie katalogu **docs**, np. **docs/media** lub **docs/images**.

4. Aplikacja powinna mieć moźliwość wyświetlenia informacji w formie okna dialogowego "O programie". W oknie należy umieścić informację o nazwie programu oraz autorze. Okno może być wywoływane z menu aplikacji lub z akcji naciśnięcia odpowiedniego przycisku na oknie głównym.

5. Aplikacja powinna realizować przykładową funkcjonalność (do wyboru).

 - Możliwość zapytania zdalnego API o dane, np. prognozę pogody, przepis, kurs walut;

 - Wizualizacja przebiegu wybranych kilku algorytmów sortowania;

 - Kalkulator (``+`` / ``-`` / ``*`` / ``÷`` / ``%`` / ``√`` / ``²``) z historią wykonywanych operacji, może umożliwiać wykonanie bardziej zaawansowanej operacji, np. : konwersji jednostek (np. temperatury °F / °C), czy zmianę formatu (dwójkowy / dzięsiętny);

 Aplikacja powinna składać się z formularza pozwalającego na wprowadzenie parametrów (np. danych żądania do API) oraz części reprezentującej wynik działania (np. dane zwrócone przez API).

6. Repozytorium projektu zawierające źródła wraz z uruchomieniowym artefaktem JAR należy dostarczyć w formie archiwum. Archiwum powinno zawierać katalog **.git**.
