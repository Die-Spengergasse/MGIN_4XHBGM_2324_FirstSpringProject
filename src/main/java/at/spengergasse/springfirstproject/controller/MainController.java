package at.spengergasse.springfirstproject.controller;


import at.spengergasse.springfirstproject.entities.Book;
import at.spengergasse.springfirstproject.repository.BookRepo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@AllArgsConstructor // lombok
@RestController // spring web
@RequestMapping("/api")
class MainController {

    BookRepo bookRepo;

    @GetMapping("/hello")
    String httpHelloMethod(){
        return "Hello";
    }

    // return all books
    @GetMapping("/")
    Iterable<Book> getAllBooks() {
        return bookRepo.findAll();
    }

    // return book by id
    @GetMapping("/{id}")
    Optional<Book> getBookById(@PathVariable Long id){
        return bookRepo.findById(id);
    }

    // todo: get latest book




}