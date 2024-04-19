import interfaces.Alimentable;
import interfaces.Comunicacble;

public class Pulpo extends CriaturasMarinas implements Comunicacble, Alimentable {

    // Atributos de clase
    int cantTentaculos;

    // Constructor heredado de la clase padre
    public Pulpo(String nombre, int tentaculos) {
        super(nombre);
        this.cantTentaculos = tentaculos;
    }

    // Método heredado de la clase padre
    @Override
    void nadar() {
        System.out.println("El octopus nada a su manera con sus " +
                this.cantTentaculos + " tentáculos...");
    }

    @Override
    public void comunicarse() {
        System.out.println(nombre + " saluda con sus " + cantTentaculos + " tentáculos...");
    }

    @Override
    public void alimentar() {
        System.out.println("Están alimentando el " + nombre);
    }

}
