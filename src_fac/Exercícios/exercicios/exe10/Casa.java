package exercicios.exe10;

public class Casa {
    private String cor;
    private int qtPortas, portasAbertas;
    private Porta_casa porta_casa;
    private boolean[] portas;

    public Casa(String cor, int qtPortas){
        this.cor = cor;
        this.qtPortas = Math.max(qtPortas, 1);
        portas = new boolean[qtPortas];
        porta_casa = new Porta_casa();
    }

    public void abrirPorta(int numPorta) throws Exception{
        porta_casa.abrir(numPorta, portas, numPorta);
    }

    public void fecharPorta(int numPorta)throws Exception{
        porta_casa.fechar(numPorta, portas, qtPortas);
    }

    public int MostrarPortasAbertas(){
        for(int i = 0; i < portas.length; i++){
            if(portas[i]){portasAbertas++;}
        }
        System.out.println("Cor da casa: "+ cor);
        return portasAbertas;
    }
}
