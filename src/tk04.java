import java.util.Scanner;

public class tk04 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Qual é o seu nome? ");
        String nome = s.nextLine();
        System.out.println("Quantos anos você tem? ");
        int anos = s.nextInt();

        s.nextLine(); // getchar() like -- pra pegar o \n do buffer

        System.out.println("Qual a sua comida favorita? ");
        String comida = s.nextLine();
        System.out.println("Olá "+nome);
        System.out.println("Você tem "+anos+" Anos");
        System.out.println("Voce gosta de "+comida);
        
        s.close();
    }
}
