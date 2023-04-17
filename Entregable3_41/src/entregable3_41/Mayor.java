package entregable3_41;
import java.util.List;
import java.util.Collections;

public class Mayor {
    public static double calcular_mayor(List<Double> lista) {
        double mayor;
        mayor = Collections.max(lista);
        return mayor;
    }
}
