package com.example.demo.models.service.dao;

import com.example.apitecnistore.models.entity.DetallePedido;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDetallePedidoDao extends CrudRepository<DetallePedido,Long> {}
