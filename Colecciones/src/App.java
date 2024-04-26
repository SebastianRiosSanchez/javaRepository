import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenidos a la fiesta de los super héroes!!!");

        List<String> superHeroes = new LinkedList<>();
        superHeroes.add("Spiderman");
        superHeroes.add("Archirivales");
        superHeroes.add("DeadPool");
        superHeroes.add("Hulk");
        superHeroes.add("Capitan america");
        superHeroes.add("Dr. Strange");

        // Este super héroe llegó tarde...
        superHeroes.add("IronMan");

        if (superHeroes.contains("Spiderman")) {
            System.out.println("Spiderman está en la fiesta !!!");
        }

        superHeroes.remove("Hulk");

        if (!superHeroes.contains("Hulk")) {
            System.out.println("Hulk no está en la fiesta !!!");
        }

        // Agregando elemento repetido
        superHeroes.add("Dr. Strange");
        superHeroes.add("Capitan america");

        // Verificando si los héroes siguen en la lista
        if (superHeroes.isEmpty()) {
            System.out.println("La fiesta ha terminado, todos se han ido para su casa...");
        } else {
            System.out.println("La fiesta continúa, aún hay " + superHeroes.size() + " super héroes festejando");
        }

        // Imprimiendo los elementos de la lista de supers
        for (String superHeroe : superHeroes) {
            System.out.println("El super " + superHeroe + " aún está en la fiesta!!!");
        }

        // Imprimiendo el dato almacenado en un índice específico
        System.out.println("El super que está de tercero es: " + superHeroes.get(2));

        System.out.println("Agregando un nuevo super...");
        superHeroes.set(7, "Toño Estrella");

        for (String heroe : superHeroes) {
            System.out.println("El nombre del super es: " + heroe);
        }

    }
}
