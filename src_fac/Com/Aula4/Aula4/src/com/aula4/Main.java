package com.aula4;

public class Main {
    public static void main(String[] args) {
        /* 
        Endereco e = new Endereco("Rua constance 469", "11563390", "Santa Bárbara", Estado.AM);
        Aluno a = new Aluno("Lev", "lucas@fatec.sp.gov.br", e);
        a.mostrarDados();
        */
        Chip ch = new Chip("1153344651634");
        Bateria b = new Bateria(85);
        Celular ce = new Celular("josesvaldo", b, ch);
        ce.ligar();
        ce.mostrarBoasVindas();
        ce.mostrarBoasVindas();
        ce.desligar();
    }
}
