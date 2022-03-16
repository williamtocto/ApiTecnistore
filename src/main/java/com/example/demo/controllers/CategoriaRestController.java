package com.example.demo.controllers;

import com.example.apitecnistore.models.entity.Categoria;
import com.example.apitecnistore.models.service.interfaces.ICategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@CrossOrigin(origins = {"http://localhost:8080"})
@RestController
@RequestMapping("/categoria")
public class CategoriaRestController {

    @Autowired
    private ICategoriaService iCategoriaService;

    //Search
    @GetMapping("/{id}")//id de aki
    public Categoria search(@PathVariable Long id) {
        return iCategoriaService.findById(id);
    }


    //Create
    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Categoria save(@RequestBody Categoria categoria) {
        return iCategoriaService.save(categoria);
    }


    //Read
    @GetMapping("/read")
    public List<Categoria> read() {
        return iCategoriaService.findAll();
    }


    //Update
    @PutMapping("/update/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Categoria update(@RequestBody Categoria categoria, @PathVariable Long id) {
        Categoria categoria1 = iCategoriaService.findById(id);
        categoria1.setNombre(categoria.getNombre());
        return iCategoriaService.save(categoria1);
    }


    /*Delete
    @DeleteMapping("/delete/{id}")
    public void deleteCategoria(@PathVariable Long id) {
        iCategoriaService.delete(id);
    }*/

}

