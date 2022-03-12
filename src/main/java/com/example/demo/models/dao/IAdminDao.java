package com.example.demo.models.dao;

import com.example.demo.models.entity.Administrador;
import com.example.demo.models.entity.Categoria;
import org.springframework.data.repository.CrudRepository;

public interface IAdminDao extends CrudRepository<Administrador,Long> {

}
