package pl.grzjar.bookAPI.controller;

//przykładowa metoda API

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.grzjar.bookAPI.model.Book;
import pl.grzjar.bookAPI.service.BookService;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<Book> bookList() {
        return bookService.getAll();
    }

    @PutMapping
    public void edit(@RequestBody Book book) {
        bookService.edit(book);
    }

    @DeleteMapping("/{id:\\d+}")
    public void delete(@PathVariable long id) {
        bookService.delete(id);
    }

    @PostMapping
    public Book add(@RequestBody Book book) {
        return bookService.addNew(book);
    }

    @GetMapping("/{id:\\d+}")
    public Book getId(@PathVariable long id) {
        if(bookService.getById(id).isPresent()){
            return bookService.getById(id).get();
        }else{
            return new Book();
        }
    }

}
