package com.example.demo.models.service.interfaces;

import com.example.demo.models.entity.DetallePedido;

import java.util.List;

public interface IDetallePedidoService {
    List<DetallePedido> findAll();
    DetallePedido findById(Long id);
    DetallePedido save(DetallePedido detallePedido);
    void delete(Long id);
}