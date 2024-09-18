package exercicios.exe12;

public class Cliente2 {
    private String nome, cpf;
    private Telefone telefone;

    public Cliente2(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        telefone = new Telefone();
    }

    public void mostrarDados(){
        System.out.println("Nome: "+nome);
        System.out.println("CPF: "+cpf);
        System.out.println("Telefone: "+telefone.getDdd()+telefone.getNumero());
    }

    public void adicionarTelefone(String DDD, String tel){
        telefone.obterDDD(DDD);
        telefone.obterNumero(tel);
    }
}
