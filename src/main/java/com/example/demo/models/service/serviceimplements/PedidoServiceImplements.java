package com.example.demo.models.service.serviceimplements;

import com.example.demo.models.dao.IPedidoDao;
import com.example.demo.models.entity.Pedido;
import com.example.demo.models.service.interfaces.IPedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PedidoServiceImplements implements IPedidoService {

    @Autowired
    private IPedidoDao iPedidoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Pedido> findAll() {
        return (List<Pedido>) iPedidoDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Pedido findById(Long id) {
        return iPedidoDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Pedido save(Pedido pedido) {
        return iPedidoDao.save(pedido);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        iPedidoDao.deleteById(id);
    }
}
