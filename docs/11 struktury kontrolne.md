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
   if(someCondition == 5) {
       break;
   }
}
```

Kontynuacja pętli ``continue``
------------------------------

```java
String[] programmers = {"Adrian", "Paul", "John", "Harry"};

for (String name : programmers) {
  if (name.equals("John"))
    continue;
  System.out.println(name);
}
```

Struktura ``try``...``catch``...``finally``
-------------------------------------------

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
    System.err.println("Invalid input.  '" + age_input + "' is not a valid integer.");
}
```
