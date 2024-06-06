import java.util.Random;

public class tk08 {
    public static void main(String[] args) {
        
        Random r = new Random();

        //int x = r.nextInt(6)+1; // os numeros com o bound 6 seriam de 0-5 pq computadores sempre começam com 0
        //double y = r.nextDouble();
        boolean z = r.nextBoolean();

        System.out.println(z);
    }
}
