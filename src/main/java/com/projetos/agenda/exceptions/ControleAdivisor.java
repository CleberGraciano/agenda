package com.projetos.agenda.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestControllerAdvice
public class ControleAdivisor {

    /*
    exemplo de exceção customizada.
     */
    @ExceptionHandler(UsuarioNaoEncontradoException.class)
    public MensagemDeErro manipularPetNaoEncontrato(UsuarioNaoEncontradoException exception){
        Erro erro = new Erro(exception.getMessage());
        return new MensagemDeErro(erro);
    }
}
