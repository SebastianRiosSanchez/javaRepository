public abstract class Figura {

    // Este comportamiento será obligatorio en las clases que hereden de figura
    abstract double calcularArea();

    void imprimirInformacion() {
        System.out.println("Esta información viene de la case asbtracta");
    }

}
