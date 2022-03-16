package com.example.demo.models.service.serviceimplements;

import com.example.apitecnistore.models.entity.Producto;
import com.example.apitecnistore.models.service.dao.IProductoDao;
import com.example.apitecnistore.models.service.interfaces.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
public class ProductoServiceImplements implements IProductoService {


    @Autowired
    private IProductoDao iProductoDao;

    @Override
    @Transactional(readOnly = true)
    public ArrayList<Producto> findAll() {
        return (ArrayList<Producto>)  iProductoDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Producto findById(Long id) {
        return iProductoDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Producto save(Producto producto) {
        return iProductoDao.save(producto);
    }



	
    /*@Override
    @Transactional
    public void delete(Long id) {
        iProductoDao.deleteById(id);
    }*/


}
