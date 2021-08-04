package com.projetos.agenda.services;

import com.projetos.agenda.dto.Evento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EventoService {

    @Autowired
    private UsuarioService usuarioService;

    public Evento cadastrarEvento(Evento evento, String nomeUsuario){
        usuarioService.buscaUsuarioPorNome(nomeUsuario);
        usuarioService.adicionaEventoLista(evento, nomeUsuario);
        return evento;
    }
}
