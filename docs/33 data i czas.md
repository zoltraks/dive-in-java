# Data i czas

## LocalDateTime

Konwersja ``LocalDateTime`` do ``Instant``.

```java
LocalDateTime localDateTime = LocalDateTime.now();
ZoneOffset zoneOffset = ZoneId.systemDefault().getRules().getOffset(localDateTime);
Instant instant = localDateTime.toInstant(zoneOffset);
```

```java
LocalDateTime localDateTime = LocalDateTime.now();
ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.of("Europe/Warsaw");
Instant instant = zonedDateTime.toInstant();
```

## Duration

Obiekty klasy ``Duration`` reprezentują upływ czasu.
W szczególności nadają się do reprezentacji różnicy czasu między dwoma punktami w czasie.

Znając dwa punkty w czasie reprezentowane przez klasy określające znacznik czasowy,
można utworzyć obiekt klasy ``Duration`` metodą klasy ``between()``.

```java
Duration duration = Duration.between(one, two);
```

## Instant

Metody ``minus()`` oraz ``plus()`` pozwalają na przesunięcie znacznika czasowego o określony interwał.

```java
Instant start = Instant.now().minus(100, ChronoUnit.SECONDS);
Instant finish = Instant.now().plus(50, ChronoUnit.MILLIS);
if (start.isBefore(finish)) {
    Duration duration = Duration.between(start, finish);
} else if (start.isAfter(finish)) {
    // impossible
} else if (start.equals(finish)) {
    // is it strange?
}
```
