package com.projetos.agenda.exceptions;

public class UsuarioDuplicadoException extends RuntimeException {
    private int statusCode = 400;

    public UsuarioDuplicadoException(String message) {
        super(message);
    }
}
