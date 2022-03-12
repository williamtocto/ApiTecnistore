package com.example.demo.models.service.serviceimplements;

import com.example.demo.models.dao.ICategoriaDao;
import com.example.demo.models.entity.Categoria;
import com.example.demo.models.service.interfaces.ICategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CategoriaServiceImplements implements ICategoriaService{

    @Autowired
    private ICategoriaDao iCategoriaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Categoria> findAll() {
        return (List<Categoria>) iCategoriaDao.findAll();
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
