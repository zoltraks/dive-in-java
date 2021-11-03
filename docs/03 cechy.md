Cechy Java
==========

### Object Oriented

"Everything is an Object"

Język Java jest językiem zorientowanym obiektowo opartym o klasy.

### Platform Independent

"Write Once, Run Anywhere"

Kompilacja prowadzi do wytworzenia binariów zawierających kod niezależny od plaformy sprzętowej.

Program może więc działać w dowolnym systemie operacyjnym pod warunkiem, że jest dla niego dostępne środowisko uruchomieniowe.

### Simple

Język łatwy do nauki. 😊

### Secure

Bezpieczeństwo zapewnione przez izolację kodu uruchomieniowego w systemie operacyjnym.

### Portable

Przenośność pomiędzy różnymi systemami operacyjnymi oraz platformami sprzętowymi.

Kompilatory języka Java oraz środowisko uruchomieniowe są napisane w ANSI C oraz C++.

### Interpreted

Kod bajtowy Javy jest tłumaczony "na bieżąco" i nie jest nigdzie przechowywany.

### High Performance

Dzięki kompilacji Just-In-Time (JIT) programy Javy mogą działać "szybciej".




Programowanie obiektowe
-----------------------

Paradygmat obiektowy .

An object-oriented paradigm offers the following concepts to simplify software development and maintenance.

1. Obiekty i klasy

Obiekty są podstawowymi jednostkami w systemie zorientowanym obiektowo składającymi się z danych oraz właściwej ich funkcjonalności. Każdy obiekt jest instancją pewnej określonej klasy.

2. Abstrakcja i enkapsulacja

The wrapping or enclosing up of data and methods into a single unit is known as encapsulation. Take medicinal capsule as an example; we don’t know what chemical it contains; we are only concerned with its effect.
This insulation of data from direct access by the program is called data hiding. For instance, while using apps, people are concerned about their functionality and not their code.

3. Dziedziczenie

Inheritance provides the concept of reusability; it is how objects of one class (Child class or Subclass) inherit or derive properties of objects of another class (Parent class).

4. Poliformizm

Przeciążanie metod (overloading).

Nadpisywanie metod (overriding).



Dziedziczenie
-------------


Types of Inheritance in Java

    Single Inheritance: The child class inherits properties and behavior from a single parent class.

    Multilevel Inheritance: The child class inherits properties from its parent class, which in turn is a child class to another parent class.

    Multiple Inheritance: When a child class has two parent classes. In Java, this concept is achieved by using interfaces.

    Hierarchical Inheritance: When a parent class has two child classes inheriting its properties.


Platforma Java
--------------

Nazwa "Java" odnosi się zarówno do nazwy języka programowania jak również środowiska w którym działają programy.

Platforma programistyczna Javy składa się z maszyny wirtualnej Java Virtual Machine (JVM) oraz z interfejsu programistycznego (API).
API w tym przypadku jest kolekcją komponentów, których można użyć do tworzenia aplikacji oraz innych komponentów.

Wyróżnia się następujące platformy języka Java:

 - Java Platform, Standard Edition (Java SE)

 - Java Platform, Enterprise Edition (Java EE)

 - Java Platform, Micro Edition (Java ME)

 - JavaFX

 - Android

Maszyna Javy
------------

Wirtualna maszyna Javy (JVM) jest wirtualną maszyną służącą do uruchamiania programów skompilowanych do postacji kodu bajtowego Javy.

Implementacja maszyny musi być zgodna ze specyfikacją

Niektóre implementacje JVM:

 - HotSpot

 - GraalVM

 - Eclipse OpenJ9

Środowisko uruchomieniowe
-------------------------

 - JRE
