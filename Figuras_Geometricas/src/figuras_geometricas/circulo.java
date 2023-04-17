package figuras_geometricas;

public class circulo {
    
    private double radio;
    
    public circulo(double radio){
        this.radio = radio;
    }
    public double Calcular_Area(){
        double area;
        area = Math.PI * Math.pow(this.radio, 2);
        return area;
    }
    public double Calcular_Perimetro(){
        double perimetro;
        perimetro = 2 * Math.PI * this.radio;
        return perimetro;
    }
}
