package pl.grzjar.bookAPI.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.grzjar.bookAPI.model.Book;

//zastępuje DAO
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {


}
