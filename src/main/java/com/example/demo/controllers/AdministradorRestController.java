package com.example.demo.controllers;

import com.example.demo.models.entity.Administrador;
import com.example.demo.models.service.interfaces.IAdminServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

//@CrossOrigin(origins = {"http://localhost:8080"})
@RestController
@RequestMapping("/administrador")
public class AdministradorRestController {

    @Autowired
    private IAdminServise iAdminServise;

    @GetMapping("/{id}")
    public Administrador searchAdministrador(@PathVariable Long id) {
        return iAdminServise.findById(id);
    }


    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Administrador saveAdministrador(@RequestBody Administrador administrador){
        return iAdminServise.save(administrador);
    }

    @GetMapping("/read")
    public ArrayList<Administrador> readAdministrador() {
        return iAdminServise.findAll();
    }


    @DeleteMapping("/delete/{id}")
    public void deleteAdministrador(@PathVariable Long id) {
        iAdminServise.delete(id);
    }

    @PutMapping("/update/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Administrador updateAdministrador(@RequestBody Administrador administrador, @PathVariable Long id) {
        Administrador admin= iAdminServise.findById(id);
        admin.setIdUsuario(administrador.getIdUsuario());
        admin.setApellido(administrador.getApellido());
        admin.setCorreo(admin.getCorreo());
        admin.setNombre(administrador.getNombre());
        admin.setIdAdministrador(administrador.getIdAdministrador());
        return iAdminServise.save(admin);
    }
}