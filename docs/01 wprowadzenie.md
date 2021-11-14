Wprowadzenie
============

## ALGORYTMY + STRUKTURY DANYCH = PROGRAMY

Program komputerowy jest to zbiór operacji zdefiniowanych w postaci kodu, który może być wykonany przez maszynę, w celu realizacji pewnego zadania.

## PROGRAMOWANIE = ROZWIĄZYWANIE PROBLEMÓW

## WYTWARZANIE OPROGRAMOWANIA

Wytwarzanie oprogramowania jako proces, który ma na celu dostarczenie produktu.

Koncepcja (specyfikacja) > Architektura (projekt) > Implementacja (realizacja) > Integracja (konsolidacja) > Test

Metodologie:

 - model kaskadowy (waterfall)

 - model przyrostowy (iteracyjny)

 - programowanie zwinne (agile, scrum, kanban, xp)

DDD (domain driven development)

TDD (test driven development)

SOLID

VCS i SCM
---------

**VCS** czyli **Version Control System** oraz **SCM** jako skrót od **Source Control Management** odnoszą się w zasadzie do tego samego, czyli systemu kontroli wersji.

Zdecydowanie najbardziej powszechnym jest Git, będący zdecentralizowanym systemem, ale można spotkać się z alternatywami w postacji Subversion (SVN), czy Mercurial (HG).

Programowanie komponentowe
--------------------------

W programowaniu obiektowym komponent jest blokiem konstrukcyjnym programu, który może być wielokrotnie używany, a także łączony z innymi komponentami.

Komponenty są sposobem na wydzielenie funkcjonalności w formie niezależnych bloków, z których można budować rozwiązanie.

Przykładem komponentu może być pole edycyjne, czy przycisk w graficznym interfejsie użytkownika, interfejs obsługi połączenia do bazy danych, czy .


W programowaniu obiektowym i technologii obiektów rozproszonych komponent jest blokiem konstrukcyjnym programu wielokrotnego użytku, który może być łączony z innymi komponentami na tym samym lub innych komputerach w sieci rozproszonej w celu utworzenia aplikacji. Przykłady komponentów to: pojedynczy przycisk w graficznym interfejsie użytkownika, mały kalkulator odsetkowy, interfejs do menedżera bazy danych. Komponenty mogą być rozmieszczone na różnych serwerach w sieci i komunikować się ze sobą w celu świadczenia potrzebnych usług.

Przetłumaczono z www.DeepL.com/Translator (wersja darmowa)

In object-oriented programming and distributed object technology, a component is a reusable program building block that can be combined with other components in the same or other computers in a distributed network to form an application. Examples of a component include: a single button in a graphical user interface, a small interest calculator, an interface to a database manager. Components can be deployed on different servers in a network and communicate with each other for needed services.


Sun Microsystems, whose JavaBeans application program interface defines how to create component, defines "a component model" as typically providing these major types of services:

    Component interface exposure and discovery. Thus, during application use, one component can interrogate another one to discover its characteristics and how to communicate with it. This allows different companies (possibly independent service providers) to create components that can interoperate with the components of other companies without either having to know in advance exactly which components it will be working with.
    Component properties. This allows a component to make its characteristics publicly visible to other components.
    Event handling. This allows one component to identify to one or more other components that an event (such as a user pressing a button) has occurred so that the component can respond to it. In Sun's example, a component that provided a button user interface for a finance application would "raise" an event when the button was pressed, resulting in a graph-calculating component gaining control, formulating a graph, and displaying it to the user.
    Persistence. This allows the state of components to be preserved for later user sessions.
    Application builder support. A central idea of components is that they will not only be easy and flexible for deploying in a distributed network, but that developers can easily create new components and see the properties of existing ones.
    Component packaging. Since a component may comprise several files, such as icons and other graphical files, Sun's component model includes a facility for packaging the files in a single file format that can be easily administered and distributed. (Sun calls their component package a JAR (Java Archive) file format.)


https://www.drdobbs.com/components-and-objects-together/184415685
