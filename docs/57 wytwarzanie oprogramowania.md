Wytwarzanie oprogramowania
==========================

Wytwarzanie oprogramowania jako proces, który ma na celu dostarczenie produktu.

Produktami mogą być aplikacje, usługi oraz biblioteki.

```
Koncepcja (specyfikacja)

Architektura (projekt)

Implementacja (realizacja)

Integracja (konsolidacja)

Test
```

Metodologie
-----------

### Model kaskadowy (waterfall)

### model przyrostowy (iteracyjny)

### programowanie zwinne (agile, scrum, kanban, xp)

### DDD (domain driven development)

### TDD (test driven development)

### Czysta architektura

SOLID
=====

SOLID jest to zbiór zasad stosowanych w programowaniu obiektowym. Termin został wymyślony przez Richarda Martina (znanego jako "Uncle Bob"), twórcę "czystej architektury". Nazwa jest akronimem pochodzącym od pierwszych liter poszczególnych zasad.

Przykłady kodu pochodzą z artykułu [SOLID Principles With (almost) Real-Life Examples in Java](https://betterprogramming.pub/solid-principles-with-almost-real-life-examples-in-java-b292a4e2c18b).

Single responsibility
---------------------

Zasada "pojedynczej odpowiedzialności" mówi o tym, że klasa powinna zawierać funkcjonalność rozwiązywania tylko jednego konkretnego problemu za który jest odpowiedzialna.

```java
public class PasswordHasher
{
    public void hashAndSavePassword(String password)
    {
        hashPassword();
        savePassword();
    }

    public void hashPassword()
    {
        //hashing implementation
    }

    public void savePassword()
    {
        //save to the db
    }
}
```

W powyższym przypadku zasada ta jest złamana, gdyż klasa ``PasswordHasher`` zawiera oprócz funkcjonalności tworzenia skrótu hasła, również metodę zapisu do bazy danych.

Open-closed principle
---------------------

Klasa powinna być otwarta na rozszerzenia, a zamknięta na wewnętrzne modyfikacje.

```java
public class PasswordHasher {
    public String hashPassword(String password, HashingType hashingType) {
        String hashedPassword;
        if (HashingType.BASE64.equals(hashingType)) {
            hashedPassword = "hashed with Base64";
        } else if (HashingType.MD5.equals(hashingType)) {
            hashedPassword = "hashed with MD5";
        } else {
            hashedPassword = null;
        }

        return hashedPassword;
    }
}
```

W powyższym nie jest możliwe dodanie nowej funkcjonalności poprzez zwykłe przeładowanie metody ``hashPassword`` w klasie dziedziczonej.

```java
public interface PasswordHasher
{
    String hashPassword(String password);
}
```

```java
public class Base64Hasher implements PasswordHasher
{
    @Override
    public String hashPassword(String password)
    {
        return "hashed with Base64";
    }
}
```

```java
public class MD5Hasher implements PasswordHasher
{
    @Override
    public String hashPassword(String password)
    {
        return "hashed with MD5";
    }
}
```

```java
public class Sha1Hasher implements PasswordHasher
{
    @Override
    public String hashPassword(String password)
    {
        return "hashed with SHA1";
    }
}
```

Liskov substitution principle
-----------------------------

Klasa dziedzicząca (pochodna) powinna obsłużyć pełną funkcjonalność klasy dziedziczonej (bazowej) zachowując możliwość traktowania jej obiektów tak samo jak obiekty klasy dziedziczonej (bazowej).

```java
public abstract class Hashed
{
    PasswordHasher passwordHasher;
    String hash;

    public void generateHash(String password)
    {
        hash = passwordHasher.hashPassword(password);
    }
}
```

```java
public class Base64Hashed extends Hashed
{
    public Base64Hashed()
    {
        this.passwordHasher = new Base64Hasher();
    }
}
```

```java
public class MD5Hashed extends Hashed
{
    public MD5Hashed()
    {
        this.passwordHasher = new MD5Hasher();
    }
}
```

```java
public class SHA1Hashed extends Hashed
{
    public SHA1Hashed()
    {
        this.passwordHasher = new SHA1Hashed();
    }
}
```

Interface segregation principle
-------------------------------

Interfejsy nie powinny wymuszać implementacji funkcji, za które nie odpowiadają.

```java
public interface PasswordHasher
{
    String hashPassword(String password);
    String decodePasswordFromHash(String hash);
}
```

Interfejsy powinny być podzielone na małe, realizujące tylko określoną funkcjonalność.

```java
public interface HashDecoder
{
    String decodePasswordFromHash(String hash);
}
```

```java
public class Base64Hasher implements PasswordHasher, HashDecoder
{
    @Override
    public String hashPassword(String password)
    {
        return "hashed with base64";
    }

    @Override
    public String decodePasswordFromHash(String hash)
    {
        return "decoded from base64";
    }
}
```

Dependency inversion principle
------------------------------

Obiekty powinny posługiwać się abstrakcjami, a nie konkretnymi implementacjami.

```java
public class PasswordService
{
    private Base64Hasher hasher;
    void hashPassword(String password)
    {
        hasher.hashPassword(password);
    }
}
```

Konkretne implementacje mogą zostać przekazane przy użyciu techniki "wstrzykiwania zależności".

```java
public class PasswordService
{
    private PasswordHasher passwordHasher;

    public PasswordService(PasswordHasher passwordHasher)
    {
        this.passwordHasher = passwordHasher;
    }

    void hashPassword(String password)
    {
        hasher.hashPassword(password);
    }
}
```
