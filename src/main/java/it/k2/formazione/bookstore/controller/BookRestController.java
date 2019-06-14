package it.k2.formazione.bookstore.controller;

import it.k2.formazione.bookstore.model.Book;
import it.k2.formazione.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController("/book")
public class BookRestController {

    @Autowired
    BookService bookService;

    @GetMapping(name = "/findall")
    public ResponseEntity<List<Book>> findall(){

        List<Book> books = bookService.findAll();

        return new ResponseEntity<List<Book>>(books, HttpStatus.OK);

    }

    @PostMapping(name = "/findallByPage")
    public ResponseEntity<List<Book>> findallByPage( Pageable pageable){

        List<Book> result = new ArrayList<>();

        Page<Book> books = bookService.find(pageable);

        books.stream().forEach(book -> {
            result.add(book);
        });

        return new ResponseEntity<List<Book>>(result, HttpStatus.OK);

    }
}
