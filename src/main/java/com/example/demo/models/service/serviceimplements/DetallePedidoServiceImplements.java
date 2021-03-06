package com.example.demo.models.service.serviceimplements;

import com.example.apitecnistore.models.entity.DetallePedido;
import com.example.apitecnistore.models.service.dao.IDetallePedidoDao;
import com.example.apitecnistore.models.service.interfaces.IDetallePedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
public class DetallePedidoServiceImplements implements IDetallePedidoService {

    @Autowired
    private IDetallePedidoDao iDetallePedidoDao;

    @Override
    @Transactional(readOnly = true)
    public ArrayList<DetallePedido> findAll() {
        return (ArrayList<DetallePedido>) iDetallePedidoDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public DetallePedido findById(Long id) {
        return iDetallePedidoDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public DetallePedido save(DetallePedido detallePedido) {
        return iDetallePedidoDao.save(detallePedido);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        iDetallePedidoDao.deleteById(id);
    }


}
