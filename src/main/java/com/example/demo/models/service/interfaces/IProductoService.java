package com.example.demo.models.service.interfaces;

import com.example.apitecnistore.models.entity.Producto;

import java.util.ArrayList;

public interface IProductoService {


    ArrayList<Producto> findAll();

    Producto findById(Long id);

    Producto save(Producto producto);


}