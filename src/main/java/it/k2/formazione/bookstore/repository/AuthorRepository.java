package it.k2.formazione.bookstore.repository;

import it.k2.formazione.bookstore.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
