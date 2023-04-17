package entregable3_19_fijo;

public class Triangulo {
    
    public static double calcular_area(double lado){
        double area;
        area = Math.pow(lado,2) / 2; 
        return area;
    }
    public static double calcular_perimetro(double lado){
        double perimetro;
        perimetro = 3 * lado;
        return perimetro;
    }
    public static double calcular_altura(double lado){
        double altura;
        altura = Math.sqrt(Math.pow(lado,2)-Math.pow(lado/2,2));
        return altura;
    }
    
}
