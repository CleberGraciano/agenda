package com.projetos.agenda.controllers;

import com.projetos.agenda.dto.Usuario;
import com.projetos.agenda.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public Usuario adicionarUsuario(@RequestBody Usuario usuario){
        return usuarioService.adicionarUsuario(usuario);
    }

    @GetMapping
    public List<Usuario> listarUsuarios(){
        return usuarioService.exibirUsuarios();
    }

    @GetMapping("/{nome}")
    public Usuario buscaUsuarioPorNome(@PathVariable String nome){
        return usuarioService.buscaUsuarioPorNome(nome);
    }
}
