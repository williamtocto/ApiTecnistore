package com.example.demo.models.service.serviceimplements;


import com.example.apitecnistore.models.entity.Usuario;
import com.example.apitecnistore.models.service.dao.IUsuarioDao;
import com.example.apitecnistore.models.service.interfaces.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
public class UsuarioServiceImplements implements IUsuarioService {

    @Autowired
    private IUsuarioDao iUsuarioDao;

    @Override
    @Transactional(readOnly = true)
    public ArrayList<Usuario> findAll() {
        return (ArrayList<Usuario>)iUsuarioDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Usuario findById(Long id) {
        return iUsuarioDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Usuario save(Usuario usuario) {
        return iUsuarioDao.save(usuario);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        iUsuarioDao.deleteById(id);
    }
}
