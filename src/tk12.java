import java.util.Scanner;

public class tk12 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        String nome = "";
        int idade = 0;

        while(nome.isBlank()){
            System.out.println("Coloque seu nome:");
            nome = s.nextLine();
        }

        do{
            System.out.println("Coloque sua idade:");
            idade = s.nextInt();
        }while(idade == 0);

        System.out.println("Olá "+nome);
        System.out.println("Você tem "+idade+" anos.");
        s.close();
    }
}
