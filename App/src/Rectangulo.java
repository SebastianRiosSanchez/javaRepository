public class Rectangulo extends Figura {

    double lado1;
    double lado2;

    public Rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    double calcularArea() {
        return this.lado1 * this.lado2;
    }

}
