package exercicios.exe2;

public class Lampada {
    int qtClick;
    Estado estado;
    public String status;

    public Lampada(Estado estado){
        this.estado = estado;
        this.qtClick = 1;
    }

    public void clickLamp(){
        if(estado == Estado.ON){estado = Estado.OFF;}
        else {
            estado = Estado.ON;
            System.out.println("Quantidade de vezes que a lâmpada foi acesa: "+qtdAcendimentos());
        }  
    }

    public int qtdAcendimentos(){
        return qtClick++;
    }

    public String checaEstado(){
        if(estado == Estado.ON){return status = "Acesa.";}
        else return status = "Apagado.";
    }
}
