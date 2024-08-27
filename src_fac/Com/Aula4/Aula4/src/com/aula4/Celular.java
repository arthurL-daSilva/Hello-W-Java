package com.aula4;

public class Celular {
    private String nome;
    private Bateria bateria;
    private Chip chip;
    private boolean ligado;

    public Celular(String nome, Bateria bateria, Chip chip) {
        this.nome = nome;
        this.bateria = bateria;
        this.chip = chip;
    }

    public boolean isOk(){
        return !ligado && !bateria.isVazio() && chip.isValido();
    }

    public void ligar(){
        if(isOk()){
            System.out.println("Ligou.");
            ligado = !ligado;
            bateria.gastar();
        }
    }

    public void desligar(){
        if(ligado){
            ligado = !ligado;
            System.out.println("Desligou.");
        }
    }

    public void mostrarBoasVindas(){
        if(ligado && !bateria.isVazio()){
            System.out.println("Oi, "+nome);
            bateria.gastar();
            bateria.gastar();

        }
    }
}
