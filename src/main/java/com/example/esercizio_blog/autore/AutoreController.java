package com.example.esercizio_blog.autore;

import general.CreateResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/autori")
@RequiredArgsConstructor
public class AutoreController {

    private final AutoreService autoreService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Autore> findAll() {
        return autoreService.findAll();
    }

    @GetMapping("/{id}")
    public Autore findById(@PathVariable Long id) {
        return autoreService.findById(id);
    }

    @PutMapping("/{id_autore}")
    public Autore findAndUpdate(@PathVariable Long id_autore, @RequestBody Autore body){
        return autoreService.findByIdAndUpdate(id_autore, body);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CreateResponse save(@RequestBody AutoreRequest request) {
        return autoreService.save(request);
    }

    @DeleteMapping("/{id_autore}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void findAndDelete(@PathVariable Long id_autore){autoreService.findById(id_autore);}
}
