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

## Serializacja i deserializacja JSON przy użyciu biblioteki gson

```java
Gson gson = new GsonBuilder()
  .setPrettyPrinting()
  .create();
String json = gson.toJson(obj);
```

```java
Gson gson = new GsonBuilder()
  .setPrettyPrinting()
  .create();
  MyClass o = (MyClass)gson.fromJson(json, MyClass.class);
T obj = (T)gson.fromJson(json, getClass());
```

W niektórych przypadkach, jak w przypadku klasy ``LocalDateTime`` dla poprawnej reprezentacji wartości może być konieczne dodanie klasy adaptera typu.

```java
public class LocalDateTimeAdapter extends TypeAdapter<LocalDateTime> {

    private static final String FORMAT = "yyyy-MM-dd HH:mm:ss.SSS";

    @Override
    public void write(final JsonWriter jsonWriter, final LocalDateTime localDate) throws IOException {
        if (localDate == null) {
            jsonWriter.nullValue();
        } else {
            jsonWriter.value(localDate.format(DateTimeFormatter.ofPattern(FORMAT)));
        }
    }

    @Override
    public LocalDateTime read(final JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        } else {
            return LocalDateTime.parse(jsonReader.nextString());
        }
    }
}
```

```java
Gson gson = new GsonBuilder()
  .setPrettyPrinting()
  .registerTypeAdapter(LocalDateTime.class, new LocalDateTimeAdapter().nullSafe())
  .create();
```
