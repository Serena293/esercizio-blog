package com.example.esercizio_blog.autore;

import com.example.esercizio_blog.post.Post;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "autori")
public class Autore {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_autore;
    private String nome;
    private String cognome;
    private String email;
    private String dataDiNascita;
    private String avatar;


    @OneToMany(mappedBy = "autore")  //Un post è scritto da un autore
    private List<Post> post = new ArrayList<>();
}
