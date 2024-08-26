package exercicios.exe4;

public class Cliente {

    String nome;
    double saldo, limite;

    public Cliente(String nome, double saldo, double limite){
        this.nome = nome;
        this.saldo = saldo;
        this.limite = limite;
    }

    public void sacar(double quantia){
        if(saldo > quantia && quantia < limite){
            saldo-=quantia;
        }else System.out.println("Você tentou sacar mais que seu limite!");
    }

    public void depositar(double quantia){
        saldo+=quantia;
        if(saldo < limite){limite = saldo;}
    }

    public void checarSaldo(){
        System.out.println("Seu saldo: "+saldo);
        System.out.println("Seu limite: "+limite);
    }

    public String obterNome(){
        return nome;
    }
}