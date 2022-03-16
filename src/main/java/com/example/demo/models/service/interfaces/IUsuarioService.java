package com.example.demo.models.service.interfaces;


import com.example.apitecnistore.models.entity.Usuario;

import java.util.ArrayList;

public interface IUsuarioService {
    ArrayList<Usuario> findAll();

    Usuario findById(Long id);

    Usuario save(Usuario usuario);

    void delete(Long id);
}
