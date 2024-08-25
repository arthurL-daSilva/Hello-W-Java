package exercicios.exe1;

public class Pessoa {
    public String nome, sexo;
    public int idade;
    public boolean vegetariana;

    public Pessoa(String nome, String sexo, int idade, boolean vegetariana){
        this.nome = nome;
        this.sexo = sexo;
        this.idade = Math.max(0, idade);
        this.vegetariana = vegetariana;
    }
    
}
