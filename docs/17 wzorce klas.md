Wzorce klas
===========

Klasa typu POJO
---------------

Nazwa *POJO* jest skrótem od *Plain Old Java Object*.

Tym terminem określa się klasę, która nie ma narzuconej konwencji nazewniczej, zawiera jedynie atrybuty oraz metody.

Klasa *POJO* nie rozszerza żadnej klas, dziedziczy jedynie po domyślnej klasie **Object**.

Klasa *POJO* nie implementuje żadnego interfejsu.

```java
public class Employee {

    public String firstName;
    public String lastName;

}
```

Klasa *POJO* może definiować własny konstruktor parametryczny, przesłaniając domyślny bezparametrowy.


```java
public class Employee {

    public String firstName;
    public String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
```

Klasa typu Bean
---------------

Nazwa tego rodzaju klas pochodzi z mechanizmu *JavaBeans*.

Tym terminem określa się klasy, które mają zdefiniowany bezparametrowy konstruktor, oraz prywatne atrybuty, do których dostęp odbywa się poprzez metody dostępowe **getXXX()** oraz **setXXX()**. Dla pól logicznych dopuszczone jest użycie nazwy **isXXX()** dla metody dostępowej zwracającej wartość pola.

```java
public class Employee {

    private String firstName;
    private String lastName;
    private boolean employed;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isEmployed() {
        return employed;
    }

    public void setEmployed(boolean employed) {
        this.employed = employed;
    }

}
```

Klasa narzędziowa
-----------------

Klasa udostępniająca jakąś konretną funkcjonalność, najczęściej w formie publicznych statycznych metod klasy. Aby zapewnić, że tylko statyczne metody klasy będą możliwe do użycia, można dodać prywatny konstruktor klasy, a ją samą zadeklarować jako klasę finalną.

```java
public final class Commons {

    private Commons() {
    }

    public static void utilityFunction1() {
    }

    public static void utilityFunction2() {
    }

}
```

Przykładem może być klasa ``org.apache.commons.io.FileUtils`` znajdująca się w bibliotece ``commons-io``.

Spotykaną praktyką jest umieszczanie wspólnych funkcjonalności dla konkretnego projektu w pakiecie głównym w klasie **Common** lub **Utility**.
