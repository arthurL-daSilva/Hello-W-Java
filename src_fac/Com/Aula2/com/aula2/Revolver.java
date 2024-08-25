package com.aula2;

public class Revolver {
    int currentBullets, maxBullets;

    //this.maxBullets -> Atributo
    //maxBullets -> parâmetro
    Revolver(int maxBullets, int currentBullets){
        this.currentBullets = currentBullets;
        this.maxBullets = maxBullets;
    }
    void Reload(){
        if(currentBullets == maxBullets){
            System.out.println("Arma cheia!");
        }
        else{
            System.out.println("Recarregando...");
            currentBullets = maxBullets;
        }
    }

    void Fire(){
        if(currentBullets > 0){
            System.out.println("Atirou!");
            currentBullets--;
        }
        else{
            System.out.println("Sem balas! Recarregue a arma!");
        }
    }
    
    void ShowAmmo(){
        System.out.println("Balas restantes: "+ currentBullets);
    }
}
