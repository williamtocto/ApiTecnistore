package com.example.demo.models.service.interfaces;

import com.example.apitecnistore.models.entity.Categoria;

import java.util.ArrayList;

public interface ICategoriaService {
    ArrayList<Categoria> findAll();

    Categoria findById(Long id);

    Categoria save(Categoria categoria);

    void delete(Long id);
}
