package exercicios.exe11;
import exercicios.exe10.Casa;
import exercicios.exe10.Porta_casa;

public class Apartamento {
    private Casa apartamento;
    private int num_apartamento, edificio;

    public Apartamento(int num_apartamento, int edificio){
        this.num_apartamento = num_apartamento;
        this.edificio = edificio;
    }

    public void mostrar(){
        System.out.println("Edificio: "+edificio);
        System.out.println("Apartamento número: "+ num_apartamento);
    }

    public int getNumApartamento(){
        return num_apartamento;
    }

    public int getNumEdificio(){
        return edificio;
    }
}
