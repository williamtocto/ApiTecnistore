package com.example.demo.models.service.interfaces;

import com.example.apitecnistore.models.entity.Administrador;

import java.util.ArrayList;

public interface IAdminServise {

    ArrayList<Administrador> findAll();

    Administrador findById(Long id);

    Administrador save(Administrador administrador);

    void delete(Long id);
}