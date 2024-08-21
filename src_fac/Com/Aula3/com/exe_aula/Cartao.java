package com.exe_aula;

public class Cartao {
    private double fatura;
    private Cliente cliente;

    public Cartao(double fatura, Cliente cliente){
        this.fatura = fatura;
        this.cliente = cliente;
    }

    public void CalDesc(){
        switch (cliente) {
            case PLATINUM:
                fatura = fatura-(fatura*0.15);
                break;
            case GOLD:
                fatura = fatura-(fatura*0.10);
                break;
            case SILVER:
                fatura = fatura-(fatura*0.05);
                break;
        }
    }

    public double ShowFatura(){
        return fatura;
    }
}
