package com.example.demo.controllers;


import com.example.apitecnistore.models.entity.DetallePedido;
import com.example.apitecnistore.models.service.interfaces.IDetallePedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


//@CrossOrigin(origins = {"http://localhost:8080"})
@RestController
@RequestMapping("/detallepedido")
public class DetallePedidoRestController {
    @Autowired
    private IDetallePedidoService iDetallePedidoService;

    //Search
    @GetMapping("/{id}")//id de aki
    public DetallePedido search(@PathVariable Long id) {
        return iDetallePedidoService.findById(id);
    }

    //Create
    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public DetallePedido save(@RequestBody DetallePedido detallePedido) {
        return iDetallePedidoService.save(detallePedido);
    }

    //Read
    @GetMapping("/read")
    public ArrayList<DetallePedido> read() {
        return iDetallePedidoService.findAll();
    }

    //Update
    //Delete
    /*
    @PutMapping("/update/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Pedido updatePedido(@RequestBody Pedido pedido, @PathVariable Long id) {
        Pedido pedido1 = iPedidoService.findById(id);
        pedido1.setIdPedido(pedido.getIdPedido());
        pedido1.setFecha(pedido.getFecha());
        pedido1.setTotalGeneral(pedido.getTotalGeneral());
        return iPedidoService.save(pedido1);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteDetallePedido(@PathVariable Long id) {
        iDetallePedidoService.delete(id);
    }*/

}

