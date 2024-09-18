package exercicios.exe12;

public class Telefone {
    private String ddd, numero;

    public void obterNumero(String num){
        numero = num;
    }

    public void obterDDD(String DDD){
        ddd = DDD;
    }

    public String getDdd() {
        return ddd;
    }

    public String getNumero() {
        return numero;
    }
}
