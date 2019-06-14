package it.k2.formazione.bookstore.repository;

import it.k2.formazione.bookstore.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
