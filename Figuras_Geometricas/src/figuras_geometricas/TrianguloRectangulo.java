package figuras_geometricas;

class TrianguloRectangulo {

  private double base;
  private double altura;

  public TrianguloRectangulo(double base, double altura) {
    this.base = base;
    this.altura = altura;
  }
  public double CalcularArea() {
      double area;
      area = (this.base * this.altura) / 2;
      return area;
  }
  public double calcularPerimetro() {
      double perimetro;
      perimetro = this.base + this.altura + this.calcularHipotenusa();
      return perimetro;
  }
   public double calcularHipotenusa() {
       double hipotenusa;
       hipotenusa = Math.sqrt((Math.pow(this.base, 2)) + (Math.pow(this.altura, 2)));
       return hipotenusa;
  }
   public String determinarTipoTriangulo() {
    if ((this.base == this.altura) && (this.base == this.calcularHipotenusa()) && (this.altura == this.calcularHipotenusa())) {
      return "Es un triangulo equilatero";
    } 
    else if ((this.base != this.altura) && (this.base != this.calcularHipotenusa()) && (this.altura != this.calcularHipotenusa())) {
      return "Es un triangulo escaleno";
    } 
    else {
      return "Es un triangulo isosceles";
    }
  }
}
