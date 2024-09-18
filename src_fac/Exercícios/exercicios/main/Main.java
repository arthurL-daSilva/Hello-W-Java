import exercicios.exe1.Churrasco;
import exercicios.exe1.Pessoa;
import exercicios.exe2.Estado;
import exercicios.exe2.Lampada;
import exercicios.exe4.Cliente;
import exercicios.exe5.Triangulo;
import exercicios.exe6.Enigma;
import exercicios.exe7.Eq2Grau;
import exercicios.exe8.Porta;
import exercicios.exe9.Transferencia;
import exercicios.exe10.Casa;
import exercicios.exe11.Apartamento;
import exercicios.exe11.Edificio;
import exercicios.exe12.Cliente2;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Pessoa p = new Pessoa("Luana", "F", 5, true);
        Churrasco c = new Churrasco();
        Lampada l = new Lampada(Estado.OFF);
        Cliente k = new Cliente("josesvaldo", 1500, 20000);
        Triangulo t = new Triangulo(4);
        Enigma e = new Enigma(52);
        Eq2Grau s = new Eq2Grau(20, 1, 6);
        Porta pt = new Porta(false);
        Cliente c1 = new Cliente("David", 1500, 10000);
        Cliente c2 = new Cliente("Fabio", 2000, 10000);
        Transferencia tr = new Transferencia();
        Casa home = new Casa("Rosa", 4);
        Edificio edi = new Edificio(2);
        Apartamento apt1 = new Apartamento(51, 1);
        Apartamento apt2 = new Apartamento(52, 1);
        Apartamento apt3 = new Apartamento(53, 1);
        Apartamento apt4 = new Apartamento(54, 2);
        Cliente2 cl2 = new Cliente2("Arthur", "55636989815");
        
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
    
        tr.transferir(c1, c2, 500);
        
        home.abrirPorta(1);
        home.abrirPorta(2);
        home.fecharPorta(1);
        home.abrirPorta(3);
        home.abrirPorta(4);
        home.fecharPorta(3);
        home.fecharPorta(4);
        System.out.println("Número de portas abertas: "+home.MostrarPortasAbertas());

        edi.adicionar(1, apt1);
        edi.adicionar(1, apt2);
        edi.adicionar(1, apt3);
        edi.adicionar(2, apt4);
        edi.listar();
        edi.buscarApart(54);
        
        
        cl2.adicionarTelefone("013", "988645322");
        cl2.mostrarDados();
    }
}
