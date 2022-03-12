package com.example.demo.models.dao;

import com.example.demo.models.entity.Pedido;
import org.springframework.data.repository.CrudRepository;

public interface IPedidoDao extends CrudRepository<Pedido, Long> {}
