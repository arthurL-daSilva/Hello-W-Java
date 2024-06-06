import java.util.Scanner;

public class tk07 {
    public static void main(String[] args) {
        
        /* -------- OPERAÇÕES MATH --------
        double x = 3.14;
        double y = -10;
        double a = 16;
        double b = 3.12312;
        double c, d;

        double z = Math.max(x, y);
        //Double z = Math.abs(y);  - Busca o valor absoluto da variável(sendo -10 aparecendo no output como 10.0)
        a = Math.sqrt(a);
        b = Math.round(b);
        c = Math.ceil(b);
        d = Math.floor(b);

        System.out.println(z);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        */

        //CALCULAR A HIPOTENUSA
        double x;
        double y;
        double z;

        Scanner s = new Scanner(System.in);

        System.out.println("Coloque a medida x: ");
        x = s.nextDouble();
        System.out.println("Coloque a medida y: ");
        y = s.nextDouble();

        z = Math.sqrt((x*x)+(y*y));

        System.out.println("A hipotenusa deu: "+z);

        s.close();
    }
}
