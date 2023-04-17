package figuras_geometricas;

public class rectangulo {
    
    private double base;
    private double altura;
    
    public rectangulo(double base,double altura) {
        this.base = base;
        this.altura = altura;
    }
    public double Calcular_Area(){
        double area;
        area = this.base * this.altura;
        return area;
    }
    public double Calcular_Perimetro(){
        double perimetro;
        perimetro = (2 * this.base) + (2 * this.altura);
        return perimetro;
    }
}
