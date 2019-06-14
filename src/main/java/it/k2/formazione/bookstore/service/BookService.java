package it.k2.formazione.bookstore.service;

import it.k2.formazione.bookstore.model.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BookService {

    List<Book> findAll();

    Page<Book> find(Pageable pageable);
}
