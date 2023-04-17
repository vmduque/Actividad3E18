package Entregable3_18;

public class Empleado {
    public static double calcular_salario_bruto(double ValorHora,double HorasTrabajadas){
        double SalarioBruto;
        SalarioBruto = ValorHora * HorasTrabajadas;
        return SalarioBruto;
    }
    public static double calcular_salario_neto(double SalarioBruto,double retencion){
        double SalarioNeto;
        SalarioNeto = SalarioBruto -((SalarioBruto * retencion)/100);
        return SalarioNeto;
    }
    
}