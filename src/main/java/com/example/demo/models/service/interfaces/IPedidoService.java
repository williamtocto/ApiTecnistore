package com.example.demo.models.service.interfaces;


import com.example.demo.models.entity.Pedido;

import java.util.ArrayList;

public interface IPedidoService {
    ArrayList<Pedido> findAll();

    Pedido findById(Long id);

    Pedido save(Pedido pedido);

    void delete(Long id);
}
