import java.util.Scanner;

public class tk11 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Pular primeiro código?\nR(s/n): ");
        String t = s.nextLine();

        if(t.equals("N") || t.equals("n")){
            temperatura(args, s);
        }

            System.out.println("Agora vamos jogar um jogo! Pressione S ou s para sair: ");
            String r = s.nextLine();

            if(r.equals("s") || r.equals("S")){
                System.out.println("Ok, saindo do jogo...\nSaiu com sucesso!!");
            }
            else{
                System.out.println("Ok vamos lá!!");
                System.out.println("Bom, quero jogar um certo jogo... Deseja continuar?\nR: ");
                String a = s.nextLine();
                if(!a.equals("n") && !a.equals("N")){
                    System.out.println("Ok... Continue por sua conta e risco...");
                }
                else{
                    System.out.println("Tudo bem... Voltando...\nVocê saiu do teste com sucesso.");
                }
            }
        
        s.close();
    }
    public static void temperatura(String[] args, Scanner s) {
        
        System.out.println("Qual é a temperatura la fora?");
        System.out.print("R: ");
        int temp = s.nextInt();

        if(temp > 30){
            System.out.println("Está quente lá fora!");
        }
        else if(temp >= 20 && temp <= 30){
            System.out.println("Está fresco lá fora!");
        }
        else{
            System.out.println("Está frio lá fora!\n\n");
        }
        s.nextLine();
    }
    
}
