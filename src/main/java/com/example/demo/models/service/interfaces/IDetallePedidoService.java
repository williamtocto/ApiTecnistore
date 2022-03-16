package com.example.demo.models.service.interfaces;

import com.example.apitecnistore.models.entity.DetallePedido;

import java.util.ArrayList;

public interface IDetallePedidoService {
    ArrayList<DetallePedido> findAll();

    DetallePedido findById(Long id);

    DetallePedido save(DetallePedido detallePedido);

    void delete(Long id);
}