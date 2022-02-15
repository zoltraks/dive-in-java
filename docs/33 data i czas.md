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
