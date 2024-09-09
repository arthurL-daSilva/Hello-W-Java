import exercicios.exe1.Churrasco;
import exercicios.exe1.Pessoa;
import exercicios.exe2.Estado;
import exercicios.exe2.Lampada;
import exercicios.exe4.Cliente;
import exercicios.exe5.Triangulo;
import exercicios.exe6.Enigma;
import exercicios.exe7.Eq2Grau;
import exercicios.exe8.Porta;

public class Main {
    public static void main(String[] args) {
        
        Pessoa p = new Pessoa("Luana", "F", 5, true);
        Churrasco c = new Churrasco();
        Lampada l = new Lampada(Estado.OFF);
        Cliente k = new Cliente("josesvaldo", 1500, 20000);
        Triangulo t = new Triangulo(4);
        Enigma e = new Enigma(52);
        Eq2Grau s = new Eq2Grau(20, 1, 6);
        Porta pt = new Porta(false);
        
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

        k.checarSaldo();
        k.sacar(22000);
        k.checarSaldo();
        System.out.println("Nome: "+k.obterNome());
        k.depositar(50.59);
        k.checarSaldo();

        t.calcArea();
        t.calcPerímetro();
        System.out.println("Area: "+t.getArea());
        System.out.println("Perímetro: "+t.getPerimetro());
        
        e.sortear();
        e.advinhar();
        
        System.out.println("Delta: "+s.delta());
        System.out.println("Raiz 1: "+s.raiz1());
        System.out.println("Raiz 2: "+s.raiz2());

        pt.abrir();
        pt.fechar();
        pt.abrir();
        pt.abrir();
        System.out.println(pt.mostrar());
    }
}
