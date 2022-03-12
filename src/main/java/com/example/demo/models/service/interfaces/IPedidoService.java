package com.example.demo.models.service.interfaces;

import com.example.demo.models.entity.Pedido;

import java.util.List;

public interface IPedidoService {
    List<Pedido> findAll();
    Pedido findById(Long id);
    Pedido save(Pedido pedido);
    void delete(Long id);
}
