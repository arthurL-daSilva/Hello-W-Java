import java.util.Scanner;

public class tk14 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int linhas;
        int colunas;
        String simb = "";

        System.out.println("Coloque o numero de linhas: ");
        linhas = s.nextInt();
        System.out.println("Coloque o número de colunas: ");
        colunas = s.nextInt();
        System.out.println("Qual simbolo vai usar?");
        simb = s.next();

        for(int i = 1; i <= linhas; i++){
            System.out.println();
            for(int j = 1; j <= colunas; j++){
                System.out.print(simb);
            }
        }


        s.close();
    }
}
