package com.example.demo.models.service.dao;

import com.example.apitecnistore.models.entity.Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductoDao extends CrudRepository<Producto,Long> {
}
