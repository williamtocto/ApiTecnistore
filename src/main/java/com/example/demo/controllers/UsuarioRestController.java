package com.example.demo.controllers;

import com.example.apitecnistore.models.entity.Usuario;
import com.example.apitecnistore.models.service.interfaces.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


//@CrossOrigin(origins = {"http://localhost:8080"})
@RestController
@RequestMapping("/usuario")
public class UsuarioRestController {

    @Autowired
    private IUsuarioService iUsuarioService;

    //Search
    @GetMapping("/{id}")
    public Usuario search(@PathVariable Long id) {
        return iUsuarioService.findById(id);
    }

    //Create
    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario save(@RequestBody Usuario usuario){
        return iUsuarioService.save(usuario);
    }

    //Read
    @GetMapping("/read")
    public ArrayList<Usuario> read() {
        return iUsuarioService.findAll();
    }

    //Update
    @PutMapping("/update/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario update(@RequestBody Usuario usuario, @PathVariable Long id) {
        Usuario user= iUsuarioService.findById(id);
        user.setIdUsuario(usuario.getIdUsuario());
        user.setTipoUsuario(usuario.getTipoUsuario());
        user.setClave(usuario.getClave());
        user.setUsuario(usuario.getUsuario());
        return iUsuarioService.save(user);
    }

    //Delete
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        iUsuarioService.delete(id);
    }





	
	


    

    

}
   