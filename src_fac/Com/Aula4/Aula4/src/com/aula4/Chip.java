package com.aula4;

public class Chip {
    private String numero;

    public Chip(String numero) {
        this.numero = numero;
    }

    public boolean isValido(){
        return numero != "";
    }
}
