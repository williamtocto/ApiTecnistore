package com.example.demo.controllers;

import com.example.demo.models.entity.Administrador;

import com.example.demo.models.service.interfaces.IAdminServise;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:8080"})
@RestController
@RequestMapping("/administrador")
public class AdministradorRestController {

    @Autowired
    private IAdminServise iAdministrador;

    @GetMapping("/{id}")
    public Administrador searchAdministrador(@PathVariable Long id) {
        return iAdministrador.findById(id);
    }
    
    
    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Administrador saveAdministrador(@RequestBody Administrador administrador){
       return iAdministrador.save(administrador);
    }

	@GetMapping("/read")
    public List<Administrador> readAdministrador() {
        return iAdministrador.findAll();
    }
	
	
	@DeleteMapping("/delete/{id}")
    public void deleteAdministrador(@PathVariable Long id) {
        iAdministrador.delete(id);
    }

    

    
    @PutMapping("/update/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Administrador updateAdministrador(@RequestBody Administrador administrador, @PathVariable Long id) {
    	Administrador admin= iAdministrador.findById(id);
        admin.setIdUsuario(administrador.getIdUsuario());
        admin.setApellido(administrador.getApellido());
        admin.setCorreo(admin.getCorreo());
        admin.setNombre(administrador.getNombre());
        admin.setIdAdministrador(administrador.getIdAdministrador());     
        return iAdministrador.save(admin);
    }
}