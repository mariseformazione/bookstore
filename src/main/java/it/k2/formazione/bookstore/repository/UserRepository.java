package it.k2.formazione.bookstore.repository;

import it.k2.formazione.bookstore.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
