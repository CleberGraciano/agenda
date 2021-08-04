package com.projetos.agenda.controllers;

import com.projetos.agenda.dto.Evento;
import com.projetos.agenda.services.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/eventos")
public class EventoController {

    @Autowired
    private EventoService eventoService;

    @PostMapping("/{nomeUsuario}")
    public Evento adicionarEvento(@RequestBody Evento evento, @PathVariable String nomeUsuario){
        return eventoService.cadastrarEvento(evento, nomeUsuario);
    }
}
