Klasy i obiekty
===============

Tworząc programy w języku ``Java`` mamy do czynienia z koncepcją ``OOP`` (Object Oriented Programming), którą określa się także pojęciem programowania zorientowanego obiektowo. Warto również podkreślić, że w przypadku języka Java ``OOP`` odnosi się do programowania obiektowego *opartego o klasy*, w przeciwieństwie do programowania obiektowego *opartego o prototypy*.

Klasy można traktować jak szablony obiektów, gdzie obiekty to instancje swoich klas.

Klasy są także sposobem na grupowanie obiektów.

Obiekty *jabłko*, *gruszka*, *banan* mogą należeć do klasy *owoców*.

Obiekty *Volvo*, *Audi*, *Toyota* mogą należeć do klasy *samochodów*.

Klasy mogą dziedziczyć po sobie i ten fakt jest wykorzystywany do programowania według modelu określającego hierarchię klas.

Hierarchia klas jest odpowiednikiem struktury drzewa, gdzie "korzeniem" jest klasa ``Object``.

```
+----------------------------------------------+
|   Samochód                                   |
+----------------------------------------------+
| + marka                 : String  {readOnly} |
| + model                 : String  {readOnly} |
| + rokProdukcji          : int     {readOnly} |
| + numerRejestracji      : String             |
| + przebieg              : long               |
+----------------------------------------------+
| + zwiększPrzebieg(long) : void               |
| + wiek(int)             : int                |
+----------------------------------------------+
```

Klasy są definicją struktury danych oraz funkcjonalności.

Klasy składają się więc z atrybutów (pól) oraz metod (funkcji).

Rozróżniamy dwa rodzaje pól oraz metod:

 - **statyczne**, nazywane polami oraz metodami klasy

 - **niestatyczne**, nazywane polami oraz metodami instancji

Metody statyczne działają bezkontekstowo, nie mają dostępu do niestatycznych pól klasy.
Aby użyć metody statycznej, należy odwołać się bezpośrednio do nazwy klasy.

Pola statyczne klasy są wspólne dla wszystkich obiektów.

Definicję statycznego pola lub metody poprzedza się słowem kluczowym ``static``.

Metody niestatyczne działają w kontekście instancji, do której jawnie odwołujemy się przy pomocy słowa ``this``.

Pola niestatyczne są cechą konkretnej instancji klasy. Każdy obiekt posiada swoje dane oddzielnie.

Modyfikatory dostępu
--------------------

Definiując klasy, pola oraz metody określamy ich "widoczność" stosując słowa kluczowe zwane modyfikatorami dostępu. Pola oraz metody są zawsze dostępne na poziomie klasy w której są zdefiniowane. Klasy są zawsze widoczne w obrębie tego samego pakietu.

| Dostęp | Słowo kluczowe | W obrębie pakietu | W podklasie poza pakietem | Wszędzie |
|-|-|-|-|-|
| domyślny | *brak* | TAK | NIE | NIE |   
| prywatny | ``private`` | NIE | NIE | NIE |   
| chroniony | ``protected`` | TAK | TAK | NIE |   
| publiczny | ``public`` | TAK | TAK | TAK |   

Domyślny dostęp nazywany jest także prywatnym dla pakietu (package-private).

Podczas dokumentowania w stylu zgodnym z **UML**, modyfikatory dostępu określamy znakiem poprzedzającym nazwę pola lub metody.

| | |
| - | - |
| ``+`` | ``public``    |
| ``-`` | ``private``   |
| ``#`` | ``protected`` |
| ``~`` | ``package``   |

Finalizacja
-----------

Domyślnie klasy mogą być dziedziczone, a ich metody zmieniane przez klasy pochodne. Aby uniemożliwić i "zamknąć" klasę na możliwość dziedziczenia bądź uniemożliwić zmianę definicji metody, należy użyć słowa kluczowego **final** po modyfikatorze dostępu.

```java
public final class SealedClass {
}
```

```java
public class BaseClass {
    public final void sealedMethod() {
    }
}
```

Adnotacje
---------

Określając klasy, pola oraz metody, a nawet pakiety, można poprzedzić ich definicję dodatkowymi polami, zwanymi adnotacjami. Pozwalają one na umieszczenie dodatkowych zawartości informacyjnych, tzw. metadanych dostępnych zarówno dla kompilatora, jak i środowiska uruchomieniowego. Informacje te dostępne są poprzez tzw. refleksję.

Adnotację poprzedzone są znakiem @. Istnieje kilka wbudowanych adnotacji, można także zdefiniować własne.

https://www.baeldung.com/java-custom-annotation

Konstruktory
------------

Konstruktory są specjalnymi metodami klas, wywoływanymi odpowiednio podczas tworzenia nowego obiektu.

Konstruktory nie są dziedziczone. Klasa pochodna musi dostarczyć swój konstruktor, ale może odwołać się do konstruktora bazowego przy pomocy słowa kluczowego ``super``.

Destruktory
-----------

Destruktory podobnie jak konstruktory są również specjalnymi metodami klas, wywoływanymi podczas usuwania obiektu, gdy nie jest on już potrzebny.

W przypadku języka ``Java`` nie używa się destruktorów na rzecz mechanizmu automatycznego zarządzania pamięcią, w tym ``GC`` (Garbage Collector).

Dziedziczenie
-------------

Dziedziczenie klasy umożliwia rozbudowanie klasy bazowej (dziedziczonej) o nowe funkcjonalności bądź jej zmianę (polimorfizm). Aby określić klasę bazową należy użyć słowa kluczowego **extends**.

```java
public class BaseClass {
    public String Name;

    public BaseClass() {
        this.Name = "BaseClass";
    }

    public void hello() {
        System.out.println(String.format("Hello from %s", this.Name));
    }
}
```

```java
public class DerivedClass extends BaseClass {
    public DerivedClass() {
        this.Name = "DerivedClass";
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        BaseClass o = new DerivedClass();
        o.hello();
    }
}
```

```
Hello from DerivedClass
```

Nie można dziedziczyć po więcej niż jednej klasie bazowej. Aby zrealizować koncept wielodziedziczenia, należy zamiast tego użyć interfejsów.

Przesłanianie
-------------

Dziedzicząc klasy można zastąpić funkcjonalność klasy bazowej. Nazywa się to *przesłanianiem* (override). W języku ``Java`` metodę można przesłonić o ile nie została ona zdefiniowana z modyfikatorem **final** umieszczając po prostu nową definicję w klasie pochodnej.

```java
public class DerivedClass extends BaseClass {
    public DerivedClass() {
        this.Name = "DerivedClass";
    }

    @Override
    public void hello() {
        System.out.println("Bye");
    }
}
```

Przyjęte jest, że w przypadku metod będących przesłoniętymi wersjami, umieszcza się przy nich adnotację ``@Override``.

Oprócz przesłaniania metod poprzez definicję w klasie pochodnej nowej wersji metody, w języku ``Java`` jest możliwe przesłonienie metody na etapie tworzenia nowego obiektu.

```java
public class Main {
    public static void main(String[] args) {
        BaseClass o = new DerivedClass() {
            @Override
            public void hello() {
                System.out.println("Custom method");
            }
        };
        o.hello();
    }
}
```

Przeciążanie
------------

Przeciążanie (overload) polega na dodaniu metody o tej samej nazwie, ale różniącej się parametrami wejściowymi. W języku ``Java`` typ zwracanej wartości musi być jednakowy dla wszystkich przeciążonych metod.

Interfejsy
----------

Interfejsy są specjalnym rodzajem definicji, podobnym do klasy, jednak z reguły nie zawierającej niczego poza definicją nagłówków metod, które musi zawierać klasa implementująca interfejs.

Klasa może implementować więcej niż jeden interfejs.

```java
public interface Hello {
    void hello();
}
```

```java
public interface Go {
    void go();
}
```

```java
public class BaseClass implements Hello, Go {
    public String Name;

    public BaseClass() {
        this.Name = "BaseClass";
    }

    @Override
    public void hello() {
        System.out.println(String.format("Hello from %s", this.Name));
    }

    @Override
    public void go() {
        System.out.println("Gone");
    }
}
```

Interfejs może zawierać pola, ale są one domyślnie polami statycznymi, zatem przydają się co najwyżej do zdefiniowania np. stałych.

Istnieje również możliwość zdefiniowania ciała metody w interfejsie używając słowa kluczowego **default**. Taka metoda nie musi być implementowana jawnie w klasie pochodnej. Nie jest to jednak zalecany sposób konstrukcji interfejsów.

```java
public interface Go {
    default void go() {
        System.out.println("Gone");
    }
}
```

Klasy abstrakcyjne
------------------

Klasy abstrakcyjne to takie, których nie można użyć to tworzenia nowych obiektów. Służą one jako klasy bazowe. Klasa pochodna dziedzicząca po klasie abstrakcyjnej jest zobligowana do implementacji wszystkich abstrakcyjnych składowych klasy bazowej.

```java
public abstract class BaseClass {
    public abstract String getName();

    public void hello() {
        System.out.println(String.format("Hello from %s", this.getName()));
    }
}
```

```java
public class DerivedClass extends BaseClass {
    @Override
    public String getName() {
        return "DerivedClass";
    }
}
```
