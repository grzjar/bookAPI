//package pl.grzjar.bookAPI.config;
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.context.event.ContextRefreshedEvent;
//import org.springframework.context.event.EventListener;
//import org.springframework.stereotype.Component;
//import org.springframework.transaction.annotation.Transactional;
//import pl.grzjar.bookAPI.model.Book;
//import pl.grzjar.bookAPI.repository.BookRepository;
//
//import java.util.concurrent.atomic.AtomicBoolean;
//
//@Component
//@Slf4j
//public class DataSetup {
//
//    private AtomicBoolean alreadyRun = new AtomicBoolean(false);
//
//    private final BookRepository bookRepository;
//
//    public DataSetup(BookRepository bookRepository) {
//        this.bookRepository = bookRepository;
//    }
//
//    @EventListener
//    @Transactional
//    public void testData(ContextRefreshedEvent event) {
//        if (!alreadyRun.getAndSet(true)) {
//            Book book = new Book(null, "12211", "JAVA", "Ja", "Też ja", "online");
//            bookRepository.save(book);
//            Book book1 = new Book(null, "199765756475", "Python", "Nie ja", "Również nie ja", "nie istnieje");
//            bookRepository.save(book1);
//        }
//    }
//}
