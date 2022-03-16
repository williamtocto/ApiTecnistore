package com.example.demo.models.service.interfaces;

import com.example.apitecnistore.models.entity.Cliente;

import java.util.ArrayList;

public interface IClienteService {

    ArrayList<Cliente> findAll();

    Cliente findById(Long id);

    Cliente save(Cliente cliente);

    void delete(Long id);
}
