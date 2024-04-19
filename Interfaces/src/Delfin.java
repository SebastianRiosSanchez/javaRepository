import interfaces.Alimentable;
import interfaces.Comunicacble;

public class Delfin extends CriaturasMarinas implements Comunicacble, Alimentable {

    // Constructor heredado de la clase padre
    public Delfin(String nombre) {
        super(nombre);
    }

    // Método heredado de la clase padre
    @Override
    void nadar() {
        System.out.println(nombre + "Está nadando con su cola, el fliper");
    }

    @Override
    public void comunicarse() {
        System.out.println(nombre + " emite sonidos y chasquidos para comunicarse...");
    }

    @Override
    public void alimentar() {
        System.out.println("Le dimos de comer una galleta a " + nombre);
    }

}
