package com.aula4;

public class Aluno {
    private String nome, email;
    private Endereco endereco;

    public Aluno(String nome, String email, Endereco endereco){
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
    }

    public void mostrarDados(){
        System.out.println("Nome: "+nome);
        System.out.println("E-mail: "+email);
        endereco.mostrarDados();
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public Endereco geteEndereco() {
        return endereco;
    }
}
