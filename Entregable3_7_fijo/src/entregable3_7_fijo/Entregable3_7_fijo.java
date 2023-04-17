package entregable3_7_fijo;

public class Entregable3_7_fijo {

    public static void main(String[] args) {
        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.setVisible(true);
    }
    public static String calcular_mayor(double A,double B){
        if (A > B){
            return "A es mayor que B";
        }
        else if ( A< B){
            return "B es mayor que A";
        }
        else {
            return "Ambos valores son iguales";
        }
    }
}
