package com.example.esercizio_blog.post;

import com.example.esercizio_blog.autore.Autore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "post")
public class Post {
     @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_post;
    private String categoria;
    private String titolo;
    private String cover;
    private String contenuto;
    private Integer tempoDiLetture;

    // Un autore può scrivere molti post
    @ManyToOne
    @JoinColumn(name = "autore_id")
    private Autore autore;
}
