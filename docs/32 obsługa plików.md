# Obsługa plików

Obsługę plików zapewniają klasy ``File`` zdefiniowana w pakiecie **java.io** oraz ``Files`` zdefiniowana w pakiecie **java.nio.file**.

Obiekt klasy ``File`` może reprezentować zarówno plik jak i katalog.

Do czytania i pisania zawartości plików służą klasy ``FileReader`` oraz ``FileWriter``.

Dobrym pomysłem do obsługi odczytu i zapisu plików jest użycie klas ``BufferedReader`` oraz ``BufferedWriter``.
Klasy te są dekoratorami klas ``FileReader`` oraz ``FileWriter``.

Metody klasy ``File``
---------------------

``getName()``

Zwraca nazwę pliku bez ścieżki katalogu.

``getAbsolutePath()``

Zwraca pełną ścieżkę dostępu do pliku.

``exists()``

Zwraca wartość logiczną określającą czy plik istnieje.

``canWrite()``

Zwraca wartość logiczną określającą czy plik jest możliwy do zapisu.

``canRead()``

Zwraca wartość logiczną określającą czy plik jest możliwy do odczytu.

``createNewFile()``

Tworzy nowy plik jeśli ten nie istnieje. Zwraca wartość **true** jeśli plik został utworzony lub **false** jeśli już istnieje.

``delete()``

Metody klasy ``Files``
----------------------

https://docs.oracle.com/javase/7/docs/api/java/nio/file/Files.html

``readString()``

``readAllLines()``

``readAllBytes()``

``isDirectory()``

``createDirectory()``

Tworzy katalog.

``createDirectories()``

Tworzy katalog i wszystkie nadrzędne jeśli nie istnieją.

Użycie klasy ``BufferedReader``
-------------------------------

```java
import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
   public static void main(String args[]) {
      try {
          char[] buffer = new char[50];
          String fileName = "file.txt";
          FileReader fileReader = new FileReader(fileName);
          BufferedReader bufferedReader = new BufferedReader(fileReader);
          int count = bufferedReader.read(buffer);
          bufferedReader.close();
          System.out.println(String.format("Read %d characters from file %s", count, fileName));
          System.out.println(buffer);
      } catch (Exception x) {
          x.printStackTrace();
      }
   }
}
```

Użycie klasy ``BufferedWriter``
-------------------------------

```java
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Main {
  public static void main(String args[]) {
     try {
         String fileName = "file.txt";
         FileWriter fileWriter = new FileWriter(fileName, true);
         BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
         String line = "Output line with some text and several data like 1234567890 or 2021-11-30\r\n";
         bufferedWriter.append(line);
         bufferedWriter.close();
     } catch (Exception x) {
         x.printStackTrace();
     }
  }
}
```
