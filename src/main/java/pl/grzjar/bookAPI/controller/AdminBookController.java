package pl.grzjar.bookAPI.controller;

//przykładowa metoda API

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.grzjar.bookAPI.model.Book;
import pl.grzjar.bookAPI.service.BookService;

import java.util.List;

@Controller
@RequestMapping("/admin/books")
public class AdminBookController {

    private BookService bookService;

    public AdminBookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/all")
    public String showPosts(Model model) {
        List<Book> books = bookService.getAll();
        model.addAttribute("books", books);
        return "all";
    }

    @GetMapping("/one")
    public String showOne(Model model, Long id){
        model.addAttribute("book", bookService.getById(id).get());
        return "one";
    }

    @GetMapping("/edit")
    public String edit(Model model, Long id) {
        model.addAttribute("book", bookService.getById(id));
        return "edit";
    }

    @PostMapping("/edit")
    public String edit(Book book){
        bookService.edit(book);
        return "redirect:/admin/books/all";
    }

    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("book", new Book());
        return "create";
    }

    @PostMapping("/create")
    public String create(Book book) {
        bookService.addNew(book);
        return "redirect:/admin/books/all";
    }

    @GetMapping("/delete")
    public String delete(Model model, Long id){
        model.addAttribute("book", bookService.getById(id).get());
        return "delete";
    }

    @PostMapping("/delete")
    public String delete(Book book){
        bookService.delete(book.getId());
        return "redirect:/admin/books/all";
    }

}
