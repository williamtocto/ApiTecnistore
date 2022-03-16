package com.example.demo.models.service.dao;

import com.example.apitecnistore.models.entity.Categoria;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoriaDao extends CrudRepository<Categoria,Long> {
}
