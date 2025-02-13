package com.example.esercizio_blog.autore;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AutoreRepository extends JpaRepository<Autore, Long> {
    Optional<Autore>findByEmail(String email);
}
