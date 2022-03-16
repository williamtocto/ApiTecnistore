package com.example.demo.models.service.dao;


import com.example.apitecnistore.models.entity.Pedido;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPedidoDao extends CrudRepository<Pedido, Long> {}
