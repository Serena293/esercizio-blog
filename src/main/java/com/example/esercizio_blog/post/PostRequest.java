package com.example.esercizio_blog.post;


import com.example.esercizio_blog.autore.Autore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostRequest {
    private String categoria;
    private String titolo;
    private String contenuto;

    private Autore autore;
}
