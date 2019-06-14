package it.k2.formazione.bookstore.repository;

import it.k2.formazione.bookstore.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {

    List<Book> findAllByIsbnAndTitle(String isbn, String title);
}
