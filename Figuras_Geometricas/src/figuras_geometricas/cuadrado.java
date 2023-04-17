
package figuras_geometricas;

public class cuadrado {
    
    private double lado;
    
    public cuadrado(double lado) {
        this.lado = lado;
    }
    public double CalcularArea() {
        double area;
        area = this.lado * this.lado;
        return area;
    }
    public double CalcularPerimetro() {
        double perimetro;
        perimetro = 4 * this.lado;
        return perimetro;
    }
}
