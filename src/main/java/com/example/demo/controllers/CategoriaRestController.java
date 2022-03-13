package com.example.demo.controllers;

import com.example.demo.models.entity.Categoria;
import com.example.demo.models.service.interfaces.ICategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:8080"})
@RestController
@RequestMapping("/categoria")
public class CategoriaRestController {


    @Autowired
    private ICategoriaService iCategoriaService;

    @GetMapping("/{id}")//id de aki
    public Categoria searchCategoria(@PathVariable Long id) {
        return iCategoriaService.findById(id);
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Categoria saveCategoria(@RequestBody Categoria categoria) {
        return iCategoriaService.save(categoria);
    }

    @GetMapping("/read")
    public List<Categoria> readCategoria() {
        return iCategoriaService.findAll();
    }


    @PutMapping("/update/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Categoria updateCategoria(@RequestBody Categoria categoria, @PathVariable Long id) {
        Categoria categoria1 = iCategoriaService.findById(id);
        categoria1.setNombre(categoria.getNombre());
        return iCategoriaService.save(categoria1);
    }
    
/*
    @DeleteMapping("/delete/{id}")
    public void deleteCategoria(@PathVariable Long id) {
        iCategoriaService.delete(id);
    }*/

}

