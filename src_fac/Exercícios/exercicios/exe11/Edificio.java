package exercicios.exe11;

public class Edificio {
    private int predios, qtAtual;
    private int[] edificio;
    private Apartamento[] apartamentos;
    private final static int MAX_APT = 3;

    public Edificio(int predios){
        this.predios = predios;
        apartamentos = new Apartamento[MAX_APT];
        edificio = new int[predios];
    }

    public void adicionar(int num_edificio, Apartamento apart) throws Exception{            
        if(qtAtual >= MAX_APT){throw new Exception("Máximo de 3 apartamentos atingido!");}
        apartamentos[qtAtual] = apart;
        qtAtual++;
        /* 
        if (apartamentos[0].getNumApartamento() == apartamentos[1].getNumApartamento() ||
            apartamentos[0].getNumApartamento() == apartamentos[2].getNumApartamento() ||
            apartamentos[1].getNumApartamento() == apartamentos[2].getNumApartamento())
            {throw new Exception("Apartamento de mesmo número ja existente!");}
        FUNÇÃO DE COMPARAÇÃO NÃO FUNCIONANDO!!
        */
    }

    public void listar(){
        for(int i=0; i < qtAtual; i++){
            apartamentos[i].mostrar();
        }
    }

    public void buscarApart(int num_apartamento){
        for(int i = 0; i < qtAtual; i++){
            if(apartamentos[i].getNumApartamento() == num_apartamento){
                apartamentos[i].mostrar();
            }
        }
    }
}
