# bookAPI

Aplikacja do zarządzania książkami w bazie danych w oparciu o Hibernate'a i Spring Boota.
Wykorzystuje też bazę danych MySQL do przechowywania informacji o książkach.

Możliwe są następujące akcje:

|Metoda|Opis|Adres|
|--|--|--|
|Readme|Przejście do pliku Readme|localhost:8080/|
|add|Dodanie książki|localhost:8080/admin/books/create|
|edit|Edycja książki|localhost:8080/admin/books/edit/id={id}|
|delete|Usunięcie książki|localhost:8080/admin/books/delete/id={id}|
|one|Wyświetlenie konkretnego rekordu|localhost:8080/admin/books/one/id={id}|
|all|Wyświetlenie wszystkich rekordów|localhost:8080/admin/books/all|
