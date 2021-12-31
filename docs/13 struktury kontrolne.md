Struktury kontrolne
===================

Warunek ``if``
--------------

```java
if (i < 2) {
  System.out.println("mniejsze od 2");
} else if (i > 2) {
  System.out.println("większe od 2");
} else {
  System.out.println("równe 2");
}
```

Wybór ``switch``
----------------

```java
enum Option {
  BLUE_PILL,
  RED_PILL
}

public void takeOne(Option option) {
  switch(option) {
    case BLUE_PILL:
      System.out.println("Story ends, wake up, believe whatever you want.");
      break;
    case RED_PILL:
      System.out.println("I show you how deep the rabbit hole goes.");
      break;
  }
}
```

Pętla ``while``
---------------

```java
int i = 0;
while (i < 100) {
  // warunek sprawdzany jest na początku pętli
  System.out.println(i);
  i++;
}
```

Pętla ``do`` ... ``while``
--------------------------

```java
int n = 0;
do {
    System.out.println(++n);
} while (n < 3);
```

Pętla ``for``
-------------

```java
for (int i = 0; i < 100; i++) { // here initialization is not done
    System.out.println(i);
}
```

Pętla ``each``
-------------

```java
List strings = new ArrayList();

strings.add("To");
strings.add("jest");
strings.add("pętla");

for (String string : strings) {
    System.out.println(string);
}
```

Przerwanie pętli ``break``
--------------------------

```java
int i = 0;
while(true) {
   if (++i == 5) {
       break;
   }
}
```

Kontynuacja pętli ``continue``
------------------------------

```java
String[] programmers = {"Alice", "Jack", "Peter", "Harry"};

for (String name : programmers) {
  if (name.equals("Jack"))
    continue;
  System.out.println(name);
}
```

Struktura ``try`` ... ``catch``
-------------------------------

Blok ``catch`` umożliwia *złapanie* wyjątku.

```java
String ageString = "abc";
try {
    int age = Integer.parseInt(ageString);
    if (age >= 18) {
        System.out.println("You can vote!");
    } else {
        System.out.println("Sorry, you can't vote yet.");
    }
} catch (NumberFormatException ex) {
    System.err.println("Invalid input. '" + ageString + "' is not a valid integer.");
}
```

Struktura ``try`` ... ``finally``
-----------------------------------------------

Blok ``finally`` wykonywany jest zawsze mimo przerwania w bloku ``try``.

```java
String error = "";
try {
    for (int i = 1; i < 5; i++) {
        if (i == 3) {
            error = "Maximum number reached";
            throw new Exception("Example exception");
        }
        System.out.println(i);
    }
} finally {
    if (error.trim().length() > 0) {
        System.out.println(String.format("Block finally: %s", error));
    }
}
```

```
1
2
Block finally: Maximum number reached
java.lang.Exception: Example exception
```

Struktura ``try`` ... ``catch`` ... ``finally``
-----------------------------------------------

Blok ``finally`` jest wykonywany zawsze, po zakończeniu bloku ``try`` i ewentualnie bloku ``catch`` odpowiadającego wyjątkowi.

```java
String error = "";
try {
    for (int i = 1; i < 5; i++) {
        if (i == 3) {
            error = "Maximum number reached";
            throw new Exception("Example exception");
        }
        System.out.println(i);
    }
} catch (Exception e) {
    System.out.println("Exception handled here...");
    e.printStackTrace();
} finally {
    if (error.trim().length() > 0) {
        System.out.println(String.format("Block finally: %s", error));
    }
}
```

```
1
2
Exception handled here...
Block finally: Maximum number reached
```

Struktura ``try-with-resources``
--------------------------------

Jest to specjalna konstrukcja kompilatora umożliwiająca zapewnienie wykonania specjalnej metody zamknięcia obiektu po wyjściu z bloku kodu.

Obiekty utworzone w sekcji ``try`` muszą implementować interfejs ``AutoCloseable``.

```java
public class SomeFunc implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("Closing instance");
        throw new Exception("Throwing exception on close");
    }

    public SomeFunc() {
        System.out.println("Created instance");
    }

    public void work() {
        System.out.println("Doing work");
    }
}
```

```java
public static void main() {
  try (SomeFunc f = new SomeFunc()) {
      f.work();
  } catch (Exception e) {
      e.printStackTrace();
  }
}
```

Możliwe jest użycie więcej niż jednego obiektu używanego w strukturze ``try-with-resources``.

Dla wszystkich tak utworzonych obiektów zostanie wywołana metoda ``close()`` nawet w przypadku rzucenia wyjątkiem jak w podanym przykładzie.

```java
public static void main() {
  try (SomeFunc f1 = new SomeFunc("Func1");
       SomeFunc f2 = new SomeFunc("Func2");
       SomeFunc f3 = new SomeFunc("Func3")
  ) {
      f1.work();
      f2.work();
      f3.work();
  } catch (Exception e) {
      e.printStackTrace();
  }
}
```

```
Created instance Func1
Created instance Func2
Created instance Func3
Doing work Func1
Doing work Func2
Doing work Func3
Closing instance Func3
Closing instance Func2
Closing instance Func1
java.lang.Exception: Throwing exception on close Func3
	  ...
	Suppressed: java.lang.Exception: Throwing exception on close Func2
		... 3 more
	Suppressed: java.lang.Exception: Throwing exception on close Func1
		... 3 more
```
