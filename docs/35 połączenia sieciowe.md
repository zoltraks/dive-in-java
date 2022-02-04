# Połączenia sieciowe

## HTTP

``HttpURLConnection``

```java
HttpURLConnection connection = (HttpURLConnection) new URL(MY_URL).openConnection();
```

```java
InputStream inputStream = connection.getInputStream();
String body = new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);
```

``HttpClient``

```java
HttpClient client = HttpClient.newHttpClient();
HttpRequest request = HttpRequest.newBuilder()
    .uri(URI.create(MY_URL))
    .build();
```

```java
HttpResponse response = client.send(request, BodyHandlers.ofString());
```

W metodzie ``send`` możemy podać inny format odpowiedzi HTTP np. ``BodyHandlers.ofByteArray()`` lub ``BodyHandlers.ofFile()``.

Bardziej zaawansowany przykład z konfiguracją klienta.

```java
HttpClient client = HttpClient.newBuilder()
  .version(HttpClient.Version.HTTP_1_1)
  .connectTimeout(Duration.ofSeconds(20))
  .build();
String url = "http://api.zpsb.alyx.pl/json/";
HttpRequest request = HttpRequest.newBuilder()
  .uri(new URI(url))
  .headers("Accept", "application/json")
  .GET()
  .build();
HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
System.out.println(response.statusCode());
System.out.println(response.body());
```

## Źródła

https://www.baeldung.com/java-http-response-body-as-string
