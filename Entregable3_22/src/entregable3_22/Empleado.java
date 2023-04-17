package entregable3_22;

public class Empleado {
    
    public static double calcular_salario(double salario_basico,double horas_trabajadas){
        double salario_mensual;
        salario_mensual = salario_basico * horas_trabajadas;
        return salario_mensual;
    }
}
