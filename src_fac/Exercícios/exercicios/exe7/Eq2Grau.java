package exercicios.exe7;

public class Eq2Grau {

    double a, b, c, delta;

    public Eq2Grau(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double delta(){
        delta = Math.pow(b, 2) - (4*a*c);
        return delta;
    }

    public double raiz1(){
        if(delta >= 0){
            double raiz1 = ((b*(-1))+(Math.sqrt(delta)))/(2*a);
            return raiz1;
        }
        else return Math.sqrt(-1);
    }

    public double raiz2(){
        if(delta >= 0){
            double raiz2 = ((b*(-1))-(Math.sqrt(delta)))/(2*a);
            return raiz2;
        }
        else return Math.sqrt(-1);
    }
}