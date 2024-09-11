package exercicios.exe9;
import exercicios.exe4.Cliente;

public class Transferencia {

    public void transferir(Cliente c1, Cliente c2, double quantia){
        //Deve ser tirado da conta do c2 e colocado no c1.
        c2.sacar(quantia);
        if(c2.getSaldo() > quantia){
            c1.depositar(quantia);
            System.out.println("Transferência feita!");
            System.out.println("Transferido do cliente "+c2.obterNome()+" para o cliente "+c1.obterNome());
        }
    }
}
