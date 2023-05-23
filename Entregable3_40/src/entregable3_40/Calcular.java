package entregable3_40;
import java.util.ArrayList;
import java.util.List;

public class Calcular {
    
    public String CalcularRaices(String stringLista) {
        String[] listaNumeros = stringLista.split(",");
        List<String> listaRaices = new ArrayList<>();
        for (String e : listaNumeros) {
            double raiz = Math.sqrt(Integer.parseInt(e));
            listaRaices.add(String.format("%.1f", raiz));
        }
        return String.join("  /  ", listaRaices);
    }

    public String CalcularCuadrados(String stringLista) {
        String[] listaNumeros = stringLista.split(",");
        List<String> listaCuadrados = new ArrayList<>();
        for (String e : listaNumeros) {
            int cuadrado = (int) Math.pow(Integer.parseInt(e), 2);
            listaCuadrados.add(Integer.toString(cuadrado));
        }
        return String.join("  /  ", listaCuadrados);
    }

    public String CalcularCubos(String stringLista) {
        String[] listaNumeros = stringLista.split(",");
        List<String> listaCubos = new ArrayList<>();
        for (String e : listaNumeros) {
            int cubo = (int) Math.pow(Integer.parseInt(e), 3);
            listaCubos.add(Integer.toString(cubo));
        }
        return String.join("  /  ", listaCubos);
    }
    
}
