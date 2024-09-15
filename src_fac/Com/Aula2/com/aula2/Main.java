package com.aula2;

public class Main {
    public static void main(String[] args) {
        Contador c = new Contador(0);
        Revolver r = new Revolver(6, 6);
        Quadrado q = new Quadrado(-10);
        System.out.println(c.mostrar());    //Se for usar este método, precisa retornar a função
        c.decrementar();
        c.incrementar();
        c.incrementar();
        System.out.println(c.mostrar());
        //c.qtContador = 0;
        //r.maxBullets = 6;
        //q.lado = 3;
        System.out.println("Área do quadrado: "+q.area());
        System.out.println("Perímetro do quadrado: "+q.perimetro());
        r.Reload();
        r.ShowAmmo();
        r.Fire();
        
    }
}
