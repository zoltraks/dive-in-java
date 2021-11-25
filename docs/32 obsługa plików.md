# Obsługa plików

Obsługę plików zapewniają klasy ``File`` zdefiniowana w pakiecie **java.io** oraz ``Files`` zdefiniowana w pakiecie **java.nio.file**.

Obiekt klasy ``File`` może reprezentować zarówno plik jak i katalog.

Do czytania i pisania zawartości można użyć klas ``FileReader`` oraz ``FileWriter``.

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
