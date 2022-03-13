package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.entity.Cliente;
import com.example.demo.models.service.interfaces.IClienteService;


@CrossOrigin(origins = {"http://localhost:8080"})
@RestController
@RequestMapping("/cliente")
public class ClienteRestController {
	
	  @Autowired
	    private IClienteService iClienteService;

	    @GetMapping("/{id}")//id de aki
	    public Cliente searchClientes(@PathVariable Long id) {
	        return iClienteService.findById(id);
	    }

	    @PostMapping("/create")
	    @ResponseStatus(HttpStatus.CREATED)
	    public Cliente saveCliente(@RequestBody Cliente cliente) {
	        return iClienteService.save(cliente);
	    }

	    @GetMapping("/read")
	    public List<Cliente> readCliente() {
	        return iClienteService.findAll();
	    }


	    @PutMapping("/update/{id}")
	    @ResponseStatus(HttpStatus.CREATED)
	    public Cliente updateProducto(@RequestBody Cliente client, @PathVariable Long id) {
	        Cliente cliente = iClienteService.findById(id);
	        
	        cliente.setIdCliente(client.getIdCliente());
	        cliente.setCedula(client.getCedula());
	        cliente.setNiombre(client.getNiombre());
	        cliente.setApellido(client.getApellido());
	        cliente.setCorreo(client.getCorreo());
	        cliente.setFechaNacimiento(client.getFechaNacimiento());
	        cliente.setDireccion(client.getDireccion());
	        cliente.setTelefono(cliente.getTelefono());
	        cliente.setIdUsuario(client.getIdUsuario());
	        cliente.setEstadoCliente(false);
	        
	        return iClienteService.save(cliente);
	    }


	    @PutMapping("/delete/{id}")
	    @ResponseStatus(HttpStatus.CREATED)
	    public Cliente deleteProducto(@RequestBody Cliente client, @PathVariable Long id) {
	        Cliente cliente = iClienteService.findById(id);

	        cliente.setEstadoCliente(false);

	        return iClienteService.save(cliente);
	    }
	    

}
