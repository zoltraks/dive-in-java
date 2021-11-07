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
while(true) {
   if (i == 5) {
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

Blok ``finally`` jest wykonywany zawsze, po zakończeniu bloku ``try`` i ewentualnie odpowiadającego wyjątkowi bloku ``catch``.

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
