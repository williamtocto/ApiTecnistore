package com.example.demo.models.service.serviceimplements;


import com.example.apitecnistore.models.entity.Cliente;
import com.example.apitecnistore.models.service.dao.IClienteDao;
import com.example.apitecnistore.models.service.interfaces.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
public class ClienteServiseImplements implements IClienteService {

    @Autowired
    private IClienteDao iClienteDao;

    @Override
    @Transactional(readOnly = true)
    public ArrayList<Cliente> findAll() {
        return (ArrayList<Cliente>) iClienteDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Cliente findById(Long id) {
        return iClienteDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Cliente save(Cliente cliente) {
        return iClienteDao.save(cliente);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        iClienteDao.deleteById(id);
    }

}
