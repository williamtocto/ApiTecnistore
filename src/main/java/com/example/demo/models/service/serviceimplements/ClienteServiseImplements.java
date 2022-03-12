package com.example.demo.models.service.serviceimplements;

import com.example.demo.models.dao.IClienteDao;
import com.example.demo.models.entity.Administrador;
import com.example.demo.models.service.interfaces.IAdminServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiseImplements implements IAdminServise {

    @Autowired
    private IClienteDao iClienteDao;

    @Override
    public List<Administrador> findAll() {
        return null;
    }

    @Override
    public Administrador findById(Long id) {
        return null;
    }

    @Override
    public Administrador save(Administrador administrador) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
