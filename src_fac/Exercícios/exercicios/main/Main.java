import exercicios.exe1.Churrasco;
import exercicios.exe1.Pessoa;
import exercicios.exe2.Estado;
import exercicios.exe2.Lampada;
import exercicios.exe4.Cliente;
import exercicios.exe5.Triangulo;

public class Main {
    public static void main(String[] args) {
        
        Pessoa p = new Pessoa("Luana", "F", 5, true);
        Churrasco c = new Churrasco();
        Lampada l = new Lampada(Estado.OFF);
        Cliente k = new Cliente("josesvaldo", 1500, 20000);
        Triangulo t = new Triangulo(4);

        System.out.println("Nome: "+p.nome);
        System.out.println("Sexo: "+p.sexo);
        System.out.println("Quantidade consumida de carne: "+c.verificarConsumo(p.idade, p.vegetariana)+"kg.");
        
        
        System.out.println("Estado da lâmpada: "+l.checaEstado());
        l.clickLamp();
        System.out.println("Estado da lâmpada: "+l.checaEstado());
        l.clickLamp();
        System.out.println("Estado da lâmpada: "+l.checaEstado());
        l.clickLamp();
        System.out.println("Estado da lâmpada: "+l.checaEstado());
        System.out.println();

        k.checarSaldo();
        k.sacar(22000);
        k.checarSaldo();
        System.out.println("Nome: "+k.obterNome());
        k.depositar(50.59);
        k.checarSaldo();
    }
}
