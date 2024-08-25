
import com.aula3.Aluno;
import com.aula3.Curso;
import com.aula3.Disciplina;
import com.exe_aula.Cliente;
import com.exe_aula.Cartao;

public class Main {
    public static void main(String[] args) {
        Disciplina d = new Disciplina("Calculo", 3.4 , 10);
        Aluno a = new Aluno("Teste", "00504823028", Curso.ADS);
        Cartao c = new Cartao(100, Cliente.PLATINUM);
        a.mostrar();
        a.verEstereotipo();
        System.out.println(a.getRa());
        System.out.println(a.getCurso());
        System.out.println(a.getNome());
        a.setNome("teste3");
        a.mostrar();
        d.mostrarStatus();
        d.mostrar();
        c.CalDesc();
        System.out.println("Sua fatura com desconto: "+c.ShowFatura());
    }
}
