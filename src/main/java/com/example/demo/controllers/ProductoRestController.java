package com.example.demo.controllers;

import com.example.demo.models.entity.Producto;
import com.example.demo.models.service.interfaces.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:8080"})
@RestController
@RequestMapping("/producto")
public class ProductoRestController {

    @Autowired
    private IProductoService iProductoService;

    @GetMapping("/{id}")//id de aki
    public Producto searchProducto(@PathVariable Long id) {
        return iProductoService.findById(id);
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Producto saveProducto(@RequestBody Producto producto) {
        return iProductoService.save(producto);
    }

    @GetMapping("/read")
    public List<Producto> readProducto() {
        return iProductoService.findAll();
    }

    @PutMapping("/update/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Producto updateProducto(@RequestBody Producto producto, @PathVariable Long id) {
        Producto producto1 = iProductoService.findById(id);

        producto1.setNombre(producto.getNombre());
        producto1.setDescripcion(producto.getDescripcion());
        producto1.setPrecio(producto.getPrecio());
        producto1.setStock(producto.getStock());
        producto1.setIdCategoria(producto.getIdCategoria());
        producto1.setEstado(true);
        return iProductoService.save(producto1);
    }

    @PutMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Producto deleteProducto(@RequestBody Producto producto, @PathVariable Long id) {
        Producto producto1 = iProductoService.findById(id);

        producto1.setEstado(false);

        return iProductoService.save(producto1);
    }


}
