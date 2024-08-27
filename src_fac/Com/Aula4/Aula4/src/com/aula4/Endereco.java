package com.aula4;

public class Endereco {
    
    private String logradouro, cep, cidade;
    private Estado estado;

    public Endereco(String logradouro, String cep, String cidade, Estado estado){
        this.logradouro = logradouro;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
    }

    public void mostrarDados(){
        System.out.println(logradouro);
        System.out.println(cep);
        System.out.println(cidade);
        System.out.println(estado);
    }
}
