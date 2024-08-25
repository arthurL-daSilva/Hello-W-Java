package com.aula2;

public class Contador {
    int qtContador;

    Contador(int qtContador){
        this.qtContador = qtContador;
    }
    void incrementar(){qtContador++;}
    void decrementar(){
        if(qtContador > 0){qtContador--;}
    }
    void zerar(){qtContador = 0;}
    int mostrar(){return qtContador;}

}