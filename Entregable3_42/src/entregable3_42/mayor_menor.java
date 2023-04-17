package entregable3_42;
import java.util.List;
import java.util.Collections;

public class mayor_menor {
    
    public static double calcular_mayor(List<Double> lista) {
        double mayor;
        mayor = Collections.max(lista);
        return mayor;
    }
    public static double calcular_menor(List<Double> lista) {
        double menor;
        menor = Collections.min(lista);
        return menor;
    }
}
