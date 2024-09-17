package exercicios.exe11;

public class Edificio {
    private int predios, qtAtual;
    private Apartamento[][] apartamentos;
    private final static int MAX_APT = 3;

    public Edificio(int predios){
        this.predios = predios;
        apartamentos = new Apartamento[MAX_APT][predios];
    }

    public void adicionar(int num_edificio, Apartamento apart) throws Exception{            
        if(apartamentos[MAX_APT-1][num_edificio-1] != null){throw new Exception("Máximo de 3 apartamentos atingido!");}
        if(apartamentos[0][num_edificio-1] == null && qtAtual != 0){qtAtual = 0;}
        if(apartamentos[qtAtual][num_edificio-1] == null){
            apartamentos[qtAtual][num_edificio-1] = apart;
            qtAtual++;
        }
    }
        
        
    public void listar(){
        for(int j = 0; j < predios; j++){
            for(int i=0; i < MAX_APT; i++){
                if(apartamentos[i][j] != null)
                    apartamentos[i][j].mostrar();
            }
        }
        
    }

    public void buscarApart(int num_apartamento){
        for(int j = 0; j < predios; j++){
            for(int i = 0; i < qtAtual; i++){
                if(apartamentos[i][j].getNumApartamento() == num_apartamento){
                    apartamentos[i][j].mostrar();
                }
            }
        }
    }
}
