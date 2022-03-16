package com.example.demo.models.service.serviceimplements;

import com.example.apitecnistore.models.entity.Categoria;
import com.example.apitecnistore.models.service.dao.ICategoriaDao;
import com.example.apitecnistore.models.service.interfaces.ICategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
public class CategoriaServiceImplements implements ICategoriaService {

    @Autowired
    private ICategoriaDao iCategoriaDao;

    @Override
    @Transactional(readOnly = true)
    public ArrayList<Categoria> findAll() {
        return ( ArrayList<Categoria>) iCategoriaDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Categoria findById(Long id) {
        return iCategoriaDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Categoria save(Categoria categoria) {
        return iCategoriaDao.save(categoria);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        iCategoriaDao.deleteById(id);
    }
}
