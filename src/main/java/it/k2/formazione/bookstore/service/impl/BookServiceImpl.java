package it.k2.formazione.bookstore.service.impl;

import it.k2.formazione.bookstore.model.Book;
import it.k2.formazione.bookstore.repository.BookRepository;
import it.k2.formazione.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookRepository bookRepository;


    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Page<Book> find(Pageable pageable) {
        return bookRepository.findAll(pageable);
    }
}
