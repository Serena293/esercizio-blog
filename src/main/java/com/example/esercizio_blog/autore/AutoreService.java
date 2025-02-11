package com.example.esercizio_blog.autore;

import general.CreateResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AutoreService {
    private final AutoreRepository autoreRepository;

    //metodo per trovare tutti gli autori,
    public List<Autore> findAll() {return autoreRepository.findAll();}



    //metodo per trovare un autore per id
    public Autore findById(Long id) {return autoreRepository.findById(id).orElse(null);}

    //metodo per creare un autore
   public CreateResponse save(AutoreRequest request){
        Autore autore = new Autore();
        BeanUtils.copyProperties(request, autore);
        autoreRepository.save(autore); //dopo il salvataggio contiene l'id

        CreateResponse response = new CreateResponse();
        response.setId(autore.getId_autore());
        return response;
}}
