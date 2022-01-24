## Wyświetlanie czasu bieżącego

```java
DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
System.out.println(df.format(LocalDateTime.now()));
```

```java
DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm:ss.SSSSSS")
  .withZone(ZoneId.systemDefault());
System.out.println(df.format(Instant.now()));
```

## Wyświetlanie różnicy czasu

```java
LocalDateTime start = LocalDateTime.now();
Thread.sleep(1000);
Duration duration = Duration.between(start, LocalDateTime.now());
double time = duration.getSeconds() + duration.getNano() / 1000000000.0;
System.out.printf("%.3f%n", time);
```

## Blok try-with-resources oraz interfejs AutoCloseable

```java
public class SomeFunction implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("Closing instance");
        throw new Exception("Throwing exception on close");
    }

    public SomeFunction() {
        System.out.println("Created instance");
    }

    public void work() {
        System.out.println("Doing work");
    }
}
```

```java
public class Play {
    public static void doSomething() {
        try (SomeFunction f = new SomeFunction()) {
            f.work();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

```java
// TODO użycie static main()
```

## Formatowane wyjście przy użyciu funkcji printf

```java
System.out.printf("Hello, World.%n");
```

```java
String s = "World";
System.out.printf("Hello, %s.%n", s);
```

## Odczyt całego pliku do obiektu klasy String

Użycie klasy **Scanner**.

```java
StringBuilder b = new StringBuilder();
Scanner s = new Scanner(new FileReader(fileName));
while (s.hasNext()) b.append(s.next());
s.close();
String result = b.toString();
```

Użycie klasy **BufferedReader**.

Efekt negatywny to możliwa zamiana sposobu zapisu znaków końca linii. Poniższy przykład zamieni sekwencję znaków **\r\n** na pojedynczy znak końca linii **\n**.

```java
String result = new BufferedReader(new FileReader(fileName))
  .lines().collect(Collectors.joining("\n"));
```

Efektywniejsza wersja z użyciem klas **BufferedInputStream** oraz **ByteArrayOutputStream**.

```java
BufferedInputStream stream = new BufferedInputStream(new FileInputStream(fileName));
ByteArrayOutputStream buffer = new ByteArrayOutputStream();
for (int result = stream.read(); result != -1; result = stream.read()) {
   buffer.write((byte) result);
}
String result = buffer.toString(StandardCharsets.UTF_8.name());
```

Najszybsza wersja z użyciem klasy **Files**

```java
byte[] bytes = Files.readAllBytes(Paths.get(fileName));
String result = new String(bytes, StandardCharsets.UTF_8);
```
