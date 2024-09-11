package com.aula5;

public class Sapo {

    private int qtPulo;
    private static int qtSapo;

    public Sapo(){
        qtPulo++;
        qtSapo++;
    }

    public int getQtPulo(){
        return qtPulo;
    }

    public static int getQtSapo(){
        return qtSapo;
    }


}
