package com.example.demo.models.service.interfaces;

import com.example.demo.models.entity.Categoria;

import java.util.List;

public interface ICategoriaService {
    List<Categoria> findAll();
    Categoria findById(Long id);
    Categoria save(Categoria categoria);
    void delete(Long id);
}
