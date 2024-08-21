package exercicios.exe1;

public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Luana", "F", 5, true);
        Churrasco c = new Churrasco();
        System.out.println("Nome: "+p.nome);
        System.out.println("Sexo: "+p.sexo);
        System.out.println("Quantidade consumida de carne: "+c.verificarConsumo(p.idade, p.vegetariana)+"kg.");
    }
}
