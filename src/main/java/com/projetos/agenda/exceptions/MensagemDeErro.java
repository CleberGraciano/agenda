package com.projetos.agenda.exceptions;



public class MensagemDeErro {
    private Erro erro;

    public MensagemDeErro(Erro erro) {
        this.erro = erro;
    }

    public Erro getErro() {
        return erro;
    }

    public void setErro(Erro erro) {
        this.erro = erro;
    }
}
