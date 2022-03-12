package com.example.demo.models.service.serviceimplements;


import com.example.demo.models.dao.ICategoriaDao;
import com.example.demo.models.dao.IUsuarioDao;
import com.example.demo.models.entity.Usuario;
import com.example.demo.models.service.interfaces.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImplements implements IUsuarioService {

    @Autowired
    private IUsuarioDao iUsuarioDao;

    @Override
    public List<Usuario> findAll() {
        return null;
    }

    @Override
    public Usuario findById(Long id) {
        return null;
    }

    @Override
    public Usuario save(Usuario usuario) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
