package com.example.esercizio_blog.autore;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//DTO
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AutoreRequest {
     private String nome;
     private String cognome;
     private String email;
     private String dataDiNascita;
   }
