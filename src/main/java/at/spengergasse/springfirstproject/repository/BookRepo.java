package at.spengergasse.springfirstproject.repository;

// repoName <managed class, id type>
//

import at.spengergasse.springfirstproject.entities.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepo extends CrudRepository<Book, Long> {

    // save(Book b)
    // findAll() -> Iterable<Book>

}