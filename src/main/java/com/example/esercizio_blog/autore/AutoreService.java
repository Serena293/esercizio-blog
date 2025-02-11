package com.example.esercizio_blog.autore;

import general.CreateResponse;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AutoreService {

    // Iniezione del repository tramite Lombok
    private final AutoreRepository autoreRepository;

    // Metodo per trovare tutti gli autori
    public List<Autore> findAll() {
        return autoreRepository.findAll();
    }

    // Metodo per creare un autore
    public CreateResponse save(AutoreRequest request) {
        Autore autore = new Autore();
        BeanUtils.copyProperties(request, autore);
        autoreRepository.save(autore); // Dopo il salvataggio contiene l'ID

        CreateResponse response = new CreateResponse();
        response.setId(autore.getId_autore());
        return response;
    }

    // Metodo per trovare un autore per ID
    public Autore findById(Long id) {
        if (!autoreRepository.existsById(id)) {
            throw new EntityNotFoundException("Autore con id " + id + " non trovato");
        }
        return autoreRepository.findById(id).get();
    }
}
