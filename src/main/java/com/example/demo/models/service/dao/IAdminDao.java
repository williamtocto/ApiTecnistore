package com.example.demo.models.service.dao;

import com.example.apitecnistore.models.entity.Administrador;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAdminDao extends CrudRepository<Administrador,Long> { }
