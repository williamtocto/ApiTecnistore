package com.example.demo.controllers;

import com.example.apitecnistore.models.entity.Cliente;
import com.example.apitecnistore.models.service.interfaces.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


//@CrossOrigin(origins = {"http://localhost:8080"})
@RestController
@RequestMapping("/cliente")
public class ClienteRestController {
    @Autowired
    private IClienteService iClienteService;

    //Search
    @GetMapping("/{id}")//id de aki
    public Cliente search(@PathVariable Long id) {
        return iClienteService.findById(id);
    }

    //Create
    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente saveCliente(@RequestBody Cliente cliente) {
        return iClienteService.save(cliente);
    }

    //Read
    @GetMapping("/read")
    public ArrayList<Cliente> readCliente() {
        return iClienteService.findAll();
    }

    //Update
    @PutMapping("/update/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente updateProducto(@RequestBody Cliente client, @PathVariable Long id) {
        Cliente cliente = iClienteService.findById(id);

        cliente.setIdCliente(client.getIdCliente());
        cliente.setCedula(client.getCedula());
        cliente.setNombre(client.getNombre());
        cliente.setApellido(client.getApellido());
        cliente.setCorreo(client.getCorreo());
        cliente.setFechaNacimiento(client.getFechaNacimiento());
        cliente.setDireccion(client.getDireccion());
        cliente.setTelefono(cliente.getTelefono());
        cliente.setIdUsuario(client.getIdUsuario());
        cliente.setEstadoCliente("true");

        return iClienteService.save(cliente);
    }

    //Delete
    @PutMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente deleteProducto(@RequestBody Cliente client, @PathVariable Long id) {
        Cliente cliente = iClienteService.findById(id);
        cliente.setEstadoCliente("false");
        return iClienteService.save(cliente);
    }


}
