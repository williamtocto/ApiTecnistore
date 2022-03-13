package com.example.demo.controllers;


import com.example.demo.models.entity.Usuario;
import com.example.demo.models.service.interfaces.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:8080"})
@RestController
@RequestMapping("/usuario")
public class UsuarioRestController {

    @Autowired
    private IUsuarioService iUsuarioService;

    @GetMapping("/{id}")
    public Usuario searchPedido(@PathVariable Long id) {
        return iUsuarioService.findById(id);
    }
    
    
    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario saveUsuario(@RequestBody Usuario usuario){
       return iUsuarioService.save(usuario);
    }

	@GetMapping("/read")
    public List<Usuario> readCliente() {
        return iUsuarioService.findAll();
    }
	
	
	@DeleteMapping("/delete/{id}")
    public void deleteProducto(@PathVariable Long id) {
        iUsuarioService.delete(id);
    }

    

    
    @PutMapping("/update/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario updateUsuario(@RequestBody Usuario usuario, @PathVariable Long id) {
        Usuario user= iUsuarioService.findById(id);
        user.setIdUsuario(usuario.getIdUsuario());
        user.setTipoUsuario(usuario.getTipoUsuario());
        user.setClave(usuario.getClave());
        user.setUsuario(usuario.getUsuario());
        return iUsuarioService.save(user);
    }
}
   