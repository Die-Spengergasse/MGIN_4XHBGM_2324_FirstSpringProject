package at.spengergasse.springfirstproject.repository;

// repoName <managed class, id type>
//

import org.springframework.data.repository.CrudRepository;

import java.awt.print.Book;

public interface BookRepo extends CrudRepository<Book, Long> {

    // save(Book b)
    // findAll() -> Iterable<Book>

}