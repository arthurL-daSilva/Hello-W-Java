package com.aula1;

public class Main {
    public static void main(String[] args) {
        /*
        Cachorro c = new Cachorro();
        c.nome = "Lucas: ";
        c.raca = "Einsenwienner";
        c.latir();
        c.mostrarRaca();

        Cachorro irouniraaula = new Cachorro();
        irouniraaula.nome = "Lourval: ";
        irouniraaula.raca = "Jougie a chave no lixo!";
        irouniraaula.latir();
        irouniraaula.mostrarRaca();
        */
        Aluno a = new Aluno();
        Aluno b = new Aluno();
        Aluno c = new Aluno();
        a.nome = "David";
        b.nome = "Fabio";
        c.nome = "Arthur";
        a.cpf = "111.222.333-44";
        b.cpf = "222.333.444-55";
        c.cpf = "333.444.555-66";
        a.idade = 35;
        b.idade = 19;
        c.idade = 21;
        a.mostrar();
        b.mostrar();
        c.mostrar();
    }
}
