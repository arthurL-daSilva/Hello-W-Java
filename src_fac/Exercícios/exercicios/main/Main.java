import exercicios.exe1.Churrasco;
import exercicios.exe1.Pessoa;
import exercicios.exe2.Estado;
import exercicios.exe2.Lampada;

public class Main {
    public static void main(String[] args) {
        
        Pessoa p = new Pessoa("Luana", "F", 5, true);
        Churrasco c = new Churrasco();
        System.out.println("Nome: "+p.nome);
        System.out.println("Sexo: "+p.sexo);
        System.out.println("Quantidade consumida de carne: "+c.verificarConsumo(p.idade, p.vegetariana)+"kg.");
        
        Lampada l = new Lampada(Estado.OFF);
        System.out.println("Estado da lâmpada: "+l.checaEstado());
        l.clickLamp();
        System.out.println("Estado da lâmpada: "+l.checaEstado());
        l.clickLamp();
        System.out.println("Estado da lâmpada: "+l.checaEstado());
        l.clickLamp();
        System.out.println("Estado da lâmpada: "+l.checaEstado());
        System.out.println();
    }
}
