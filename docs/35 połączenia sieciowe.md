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
HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString());
```

## Źródła

https://www.baeldung.com/java-http-response-body-as-string
