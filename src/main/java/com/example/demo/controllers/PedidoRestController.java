package com.example.demo.controllers;

import com.example.demo.models.entity.Pedido;
import com.example.demo.models.service.interfaces.IPedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

//@CrossOrigin(origins = {"http://localhost:8080"})
@RestController
@RequestMapping("/pedido")
public class PedidoRestController {

    @Autowired
    private IPedidoService iPedidoService;

    @GetMapping("/{id}")//id de aki
    public Pedido search(@PathVariable Long id) {
        return iPedidoService.findById(id);
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Pedido save(@RequestBody Pedido pedido) {
        return iPedidoService.save(pedido);
    }

    @GetMapping("/read")
    public ArrayList<Pedido> read() {
        return iPedidoService.findAll();
    }

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
    public void deletePedido(@PathVariable Long id) {
        iPedidoService.delete(id);
    }*/

}
