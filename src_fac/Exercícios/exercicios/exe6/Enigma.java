package exercicios.exe6;
import java.util.Random;

public class Enigma {
    Random randomNum = new Random();
    int num, advnum;

    public Enigma(int advnum){this.advnum = advnum;}

    public int sortear(){
        num = randomNum.nextInt(100);
        return num;
    }

    public void advinhar(){
        if(num == advnum){System.out.println("VOCÊ ACERTOU!!\nNúmero advinhado: "+num);}
        else System.out.println("Você errou.\nNúmero sorteado: "+num);
    }
}
