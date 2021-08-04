package com.projetos.agenda.services;

import com.projetos.agenda.dto.Evento;
import com.projetos.agenda.dto.Usuario;
import com.projetos.agenda.exceptions.UsuarioNaoEncontradoException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService {
    private List<Usuario> usuarios = new ArrayList<>();

    public Usuario adicionarUsuario(Usuario usuario){
        usuarios.add(usuario);
        return usuario;
    }


    public List<Usuario> exibirUsuarios(){
        return usuarios;
    }


    public Usuario buscaUsuarioPorNome(String nome){
        Usuario usuario = new Usuario();
        for (Usuario u: usuarios) {
            if (u.getNome().equals(nome)){
                usuario = u;
            }else {
                throw new UsuarioNaoEncontradoException("Usuario não encontrado!!");
            }
        }
        return usuario;
    }

    public void adicionaEventoLista(Evento evento, String nome){
        for (Usuario u: usuarios ) {
            if (u.getNome().equals(nome)){
                u.adicionarEventos(evento);
            }
        }
    }


}
