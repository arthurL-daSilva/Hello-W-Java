package com.aula2;

public class Quadrado {
    double lado;

    //this.lado -> atributo
    //lado -> parametro
    Quadrado(double lado){
        this.lado = Math.max(lado, 0);
    }
    double perimetro(){
        return lado*4;
    }
    double area(){
        return lado*lado;
    }
}
