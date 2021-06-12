package pl.grzjar.bookAPI.service;

import org.springframework.stereotype.Service;
import pl.grzjar.bookAPI.model.Book;
import pl.grzjar.bookAPI.repository.BookRepository;

import java.util.List;
import java.util.Optional;

@Service
public class JpaBookService implements BookService {

    //wstrzykuję BookRepository
    private final BookRepository bookRepository;

    public JpaBookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book addNew(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Optional<Book> getById(long id) {
        return bookRepository.findById(id);
    }

    @Override
    public void edit(Book book) {
        Optional<Book> book1 = getById(book.getId());
        if (book1.isPresent()) {
            //już nie jest optionalem
            Book book2 = book1.get();
            if (book.getIsbn() != null) {
                book2.setIsbn(book.getIsbn());
            }
            if (book.getAuthor() != null) {
                book2.setAuthor(book.getAuthor());
            }
            if (book.getPublisher() != null) {
                book2.setPublisher(book.getPublisher());
            }
            if (book.getTitle() != null) {
                book2.setTitle(book.getTitle());
            }
            if (book.getType() != null) {
                book2.setType(book.getType());
            }
            bookRepository.save(book2);
        }
    }

    @Override
    public void delete(long id) {
        Optional<Book> book1 = getById(id);
        if (book1.isPresent()) {
            bookRepository.deleteById(id);
        }
    }
}
