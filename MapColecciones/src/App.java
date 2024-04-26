import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido a la verdulería!!!");

        Map<String, Double> inventario = new HashMap<>();

        // Agregando elementos al inventario
        inventario.put("Banano", 0.85);
        inventario.put("Cereza", 0.26);
        inventario.put("Papaya", 0.80);
        inventario.put("Tomate", 0.25);
        inventario.put("Avichuela", 0.64);
        inventario.put("Platano", 0.82);
        inventario.put("Fresa", 0.19);
        inventario.put("Sandia", 0.45);
        inventario.put("Guanabana", 0.34);
        inventario.put("Pera", 0.76);
        inventario.put("Manzana", 0.90);
        inventario.put("Arroz", 0.66);

        // Mostrando el inventario
        System.out.println("Este es el inventario de la verdulería...");
        // KeySet() retorna un arreglo con las keys
        for (String fruta : inventario.keySet()) { // get() permite acceder al valor
            System.out.println(fruta + " :$" + inventario.get(fruta));
        }

        // Fruta para buscar
        String frutaBuscada = "kkkkk";
        System.out.println("La fruta a buscar es: " + frutaBuscada);

        if (inventario.containsKey(frutaBuscada)) {
            System.out.println("La fruta está disponible...");
        } else {
            System.out.println("Lo sentimos, la fruta no se encuentra en el inventario...");
        }

    }
}
