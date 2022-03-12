package com.example.demo.controllers;

import com.example.demo.models.entity.DetallePedido;
import com.example.demo.models.service.interfaces.IDetallePedidoService;
import com.example.demo.models.service.interfaces.IPedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:8080"})
@RestController
@RequestMapping("/detallepedido")
public class DetallePedidoRestController {

    @Autowired
    private IDetallePedidoService iDetallePedidoService;

    @GetMapping("/{id}")//id de aki
    public DetallePedido searchPedido(@PathVariable Long id) {
        return iDetallePedidoService.findById(id);
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public DetallePedido saveDetallePedido(@RequestBody DetallePedido detallePedido) {
        return iDetallePedidoService.save(detallePedido);
    }

    @GetMapping("/read")
    public List<DetallePedido> readDetallePedido() {
        return iDetallePedidoService.findAll();
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
    }*/

    @DeleteMapping("/delete/{id}")
    public void deleteDetallePedido(@PathVariable Long id) {
        iDetallePedidoService.delete(id);
    }

}

