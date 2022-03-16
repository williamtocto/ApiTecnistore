package com.example.demo.models.service.serviceimplements;

import com.example.apitecnistore.models.entity.Administrador;
import com.example.apitecnistore.models.service.dao.IAdminDao;
import com.example.apitecnistore.models.service.interfaces.IAdminServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;


@Service
public class AdminServiceImplements implements IAdminServise {

    @Autowired
    private IAdminDao iAdminDao;

    @Override
    @Transactional(readOnly = true)
    public ArrayList<Administrador> findAll() {
        return ( ArrayList<Administrador>) iAdminDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Administrador findById(Long id) {
        return iAdminDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Administrador save(Administrador administrador) {
        return iAdminDao.save(administrador);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        iAdminDao.deleteById(id);
    }
}
