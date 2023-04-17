package figuras_geometricas;

public class rombo {
    
    private double diagonal_mayor;
    private double diagonal_menor;
           
    public rombo(double diagonal_mayor,double diagonal_menor){
        this.diagonal_mayor = diagonal_mayor;
        this.diagonal_menor = diagonal_menor;
    }
    public double Calcular_Lado(){
        double lado,cateto1,cateto2;
        cateto1 = this.diagonal_mayor / 2;
        cateto2 = this.diagonal_menor / 2;
        lado = Math.sqrt((Math.pow(cateto1,2)+Math.pow(cateto2,2)));
        return lado;
    }
    public double Calcular_Area(){
        double area = (this.diagonal_mayor * this.diagonal_menor) / 2;
        return area;
    }
    public double Calcular_Perimetro(){
        double perimetro;
        perimetro = 4 * this.Calcular_Lado();
        return perimetro;
    }
}
