package exercicios.exe10;

public class Porta_casa {

    public void abrir(int numPorta, boolean portas[], int qtPortas) throws Exception{
        if (numPorta < 1 || numPorta > 4 && qtPortas < numPorta) {throw new Exception("A casa deve possuir ao menos uma porta ou\nno máximo 4 portas.");}
        if (!portas[numPorta-1]){
            portas[numPorta-1] = true;
        }
    }

    public void fechar(int numPorta, boolean portas[], int qtPortas) throws Exception{
        if (numPorta < 1 || numPorta > 4 && qtPortas < numPorta) {throw new Exception("A casa deve possuir ao menos uma porta ou\nno máximo 4 portas.");}
        if (portas[numPorta-1]){
            portas[numPorta-1] = false;
        }
        
    }
}
