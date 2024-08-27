package com.aula4;

public class Bateria {
    private int carga;

    public Bateria(int carga) {
        this.carga = carga;
    }
    
    public void recarregar(){
        //carga++;
        //carga = Math.min(100, carga);     OU
        carga = Math.min(100, ++carga);
    }

    public void gastar(){
        //carga--;
        //carga = Math.max(0, carga);   OU
        carga = Math.max(0, --carga);
    }

    public boolean isVazio(){
        return carga == 0;
    }
}
