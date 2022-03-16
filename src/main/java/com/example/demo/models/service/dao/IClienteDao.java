package com.example.demo.models.service.dao;

import com.example.demo.models.entity.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClienteDao extends CrudRepository<Cliente,Long> {

}
