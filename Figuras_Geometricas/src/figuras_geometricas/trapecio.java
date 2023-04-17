package figuras_geometricas;

public class trapecio {
    
    private double base1;
    private double base2;
    private double altura;
    
    public trapecio(double base1,double base2,double altura){
        this.base1 = base1;
        this.base2 = base2;
        this.altura = altura;
    }
    public double Calcular_Area(){
        double area;
        area = ((this.base1 + this.base2) / 2) * this.altura;
        return area;
    }
    public double Calcular_Perimetro(){
        double perimetro;
        perimetro = 2 * this.Calcular_Diagonal() + this.base1 + this.base2;
        return perimetro;
    }
    public double Calcular_Diagonal(){
        double diagonal,cateto;
        cateto = Math.abs(this.base1 - this.base2);
        diagonal = Math.sqrt(Math.pow(cateto,2) + Math.pow(this.altura,2));
        return diagonal;
    }  
}
