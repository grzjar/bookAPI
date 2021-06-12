package pl.grzjar.bookAPI.service;


import pl.grzjar.bookAPI.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {

    //daje wszystkie książki
    List<Book> getAll();

    //dodaje nową ksiązkę
    Book addNew(Book book);

    //do obrobienia
    Optional<Book> getById(long id);

    //edytuje tylko wpisane dane
    void edit(Book book);

    //usuwa konkretną książkę
    void delete(long id);

}
