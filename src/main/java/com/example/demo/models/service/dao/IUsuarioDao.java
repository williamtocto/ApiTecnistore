package com.example.demo.models.service.dao;

import com.example.apitecnistore.models.entity.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioDao extends CrudRepository<Usuario,Long> {

}
