import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {

        // La clase Scanner permite que el usuario ingrese información.
        Scanner scanner = new Scanner(System.in);
        String palabraSecreta = "gato";
        int intentosMaximos = 6;
        int intentos = 0;
        boolean adivinado = false;

        // Arreglo que almacena los espacios que van a ser llenados por el usuario
        char[] letrasAdivinadas = new char[palabraSecreta.length()];
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
            System.out.print(letrasAdivinadas[i]);
        }

    }
}
