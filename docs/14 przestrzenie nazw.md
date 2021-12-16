Przestrzenie nazw
=================

Przestrzeń nazw określa kontekst, w którym zdefiniowane są klasy. W obrębie danej przestrzeni, każda nazwa klasy musi być unikatowa. Dopuszczone jest istnienie tych samych nazw w różnych przestrzeniach nazw.

Wyboru konkretnego elementu dokonuje się przy pomocy tzw. selekcji. Polega ona na tym, że określona nazwa jest rozwiązywana w obrębie bieżącej przestrzeni nazw, a następnie we wszystkich zaimportowanych

W języku ``Java`` przestrzeń nazw określona jest przez nazwę pakietu do której należy dany plik źródłowy. Oznacza to, że klasy i metody w tym samym pakiecie "widzą się" mimo, że ich definicje znajdują się w oddzielnych plikach.

Aby jednak można było korzystać z klas zdefiniowanych w innych przestrzeniach naw, należy je zaimportować.

Służy do tego słowo kluczowe ``import``, którego używa się określenia nazwy klasy z której będzie mógł korzystać kod źródłowy. Definicje importów muszą znajdować się za definicją pakietu ``package``, ale przed jakąkolwiek definicją klasy.

```java
package org.example.test;

public class MyClass {
    public String Name;

    public MyClass(String name) {
        this.Name = name;
    }
}
```

```java
package org.example.test;

public class OtherClass extends MyClass {
    public int Age;

    public OtherClass() {
        super("Other");
    }
}
```

```java
package org.example.test.utils;

import org.example.test.OtherClass;

public class UtilityClass {
    public static void Hello() {
        var x = new OtherClass();
        System.out.println(x.Name);
    }
}
```

Gdyby nie zdefiniowano importu klasy z innego pakietu, powyższy kod mógłby zostać napisany z wykorzystaniem selekcji przy pomocy pełnej nazwy klasy zawierającej nazwę pakietu, w której została ona zdefiniowana.

```java
package org.example.test.utils;

import org.example.test.OtherClass;

public class UtilityClass {
    public static void Hello() {
        var x = new org.example.test.OtherClass();
        System.out.println(x.Name);
    }
}
```

Zwykle importowane są konkretne klasy z danych pakietów, ale możliwe jest zaimportowanie wszystkich dostępnych w pakiecie nazw przez użycie znaku gwiazdki.

```java
package org.example.test.utils;

import org.example.test.*;

public class UtilityClass {
    public static void Hello() {
        var x = new MyClass("Base");
        var y = new OtherClass();
        System.out.println(x.Name);
        System.out.println(y.Name);
    }
}
```
