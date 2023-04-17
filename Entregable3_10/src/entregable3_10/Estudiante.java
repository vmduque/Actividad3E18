package entregable3_10;

public class Estudiante {
    public static double calcular_pago_por_matricula(double patrimonio,double estrato){
        double matricula;
        matricula = 50000;
        if ((patrimonio > 2000000) && (estrato > 3)) {
            matricula = matricula + 0.03 * patrimonio;
        }
        return matricula;
    }
    
}
