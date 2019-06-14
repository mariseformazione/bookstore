package it.k2.formazione.bookstore.repository;

import it.k2.formazione.bookstore.model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Integer> {
}
