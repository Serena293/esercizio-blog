package com.example.esercizio_blog.post;

import com.example.esercizio_blog.autore.Autore;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findByAutore(Autore autore);
}
