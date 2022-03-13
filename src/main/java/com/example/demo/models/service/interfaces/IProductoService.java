package com.example.demo.models.service.interfaces;

import com.example.demo.models.entity.Producto;

import java.util.List;

public interface IProductoService {
   
	
	List<Producto> findAll();
    Producto findById(Long id);
    Producto save(Producto producto);
   

}