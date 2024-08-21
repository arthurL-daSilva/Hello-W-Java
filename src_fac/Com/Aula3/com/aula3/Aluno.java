package com.aula3;

public class Aluno {

    private String nome, ra;
    private Curso curso;

    public Aluno(String nome, String ra, Curso curso){
        this.nome = nome;
        this.ra = ra;
        this.curso = curso;
    }

    public void mostrar(){
        System.out.println("Nome: "+nome);
        System.out.println("RA: "+ra);
        System.out.println("Curso: "+curso);
    }

    public void verEstereotipo(){
        switch (curso) {
            case ADS:
                System.out.println("Mira.");
                break;
            case SI:
                System.out.println("Designer.");
                break;
            case CD:
                System.out.println("PYTHON.");
                break;
            case RH:
                System.out.println("VENCERAM A GUPY.");
                break;
            case LOG:
                System.out.println("Caminhão e container.");
                break;
            default:
                System.out.println("ninguem sabes.");
        }
    }
    //PARA MOSTRAR SOMENTE UM ATRIBUTO private
    public String getRa(){
        return ra;
    }

    public String getNome(){
        return nome;
    }

    public Curso getCurso(){
        return curso;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
}