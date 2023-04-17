package entregable3_23;

public class Entregable3_23 {

    public static void main(String[] args) {
        
        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.setVisible(true);
    }
public static String calcular_soluciones(double a, double b, double c) {
    double discriminante, solucion1, solucion2;
    discriminante = Math.pow(b, 2) - 4 * a * c;
    if (discriminante > 0) {
        solucion1 = (-b + Math.sqrt(discriminante)) / (2 * a);
        solucion2 = (-b - Math.sqrt(discriminante)) / (2 * a);
        return "Solucion 1:" + String.valueOf(solucion1) + "     Solucion 2:" + String.valueOf(solucion2);
    } 
    else if (discriminante == 0) {
        double solucion = -b / (2 * a);
        return "Solucion 1:" + String.valueOf(solucion);
    } 
    else {
        return "La ecuación no tiene soluciones reales";
    }
    }
}
 