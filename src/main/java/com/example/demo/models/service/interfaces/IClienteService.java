package com.example.demo.models.service.interfaces;

import com.example.demo.models.entity.Cliente;

import java.util.List;

public interface IClienteService {
    List<Cliente> findAll();
    Cliente findById(Long id);
    Cliente save(Cliente cliente);
    void delete(Long id);
}
