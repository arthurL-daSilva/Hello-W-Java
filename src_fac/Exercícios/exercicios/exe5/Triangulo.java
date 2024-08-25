package exercicios.exe5;

public class Triangulo {
    double lado, perimetro, area;


    public Triangulo(double lado){
        this.lado = lado;
    }
    public void calcArea(){
        area = (lado*Math.sqrt(3))/2;
    }

    public void calcPerímetro(){
        perimetro = lado * 3;
    }

    public double getPerimetro(){
        return perimetro;
    }
    public double getArea(){
        return area;
    }
}
