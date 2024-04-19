public class App {
    public static void main(String[] args) throws Exception {

        Circulo circulo = new Circulo(10);
        Rectangulo rectangulo = new Rectangulo(8.45, 6.32);

        circulo.imprimirInformacion();
        System.out.println("El área del circulo es: " + circulo.calcularArea());
        rectangulo.imprimirInformacion();
        System.out.println("El área del rectángulo es: " + rectangulo.calcularArea());

    }
}
