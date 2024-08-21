package exercicios.exe1;

public class Churrasco {
    double qtCarne;

    public double verificarConsumo(int idade, boolean vegetariana){
        if(idade < 0 || vegetariana == true){qtCarne = 0;}
        else if(idade > 4 && idade < 12){qtCarne = 1;}
        else{qtCarne = 2;}
        return qtCarne;
    }
}
