package com.example.demo.models.service.interfaces;

import com.example.demo.models.entity.Administrador;

import java.util.List;

public interface IAdminServise {
    List<Administrador> findAll();
    Administrador findById(Long id);
    Administrador save(Administrador administrador);
    void delete(Long id);
}
