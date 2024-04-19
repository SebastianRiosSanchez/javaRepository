// La palabra reservada extends permite hacer esa herencia 
public class Gato extends Animal {

    public Gato(String nombre, int edad) {
        // Con la palabra reservada super, se hace referencia a los atributos del
        // construtor del padre.
        super(nombre, edad);
    }

    // Palabra reservada @override para hacer referencia a la sobre-escritura del
    // método de la clase padre.
    @Override
    public String hacerSonido() {
        return "Maullido";
    }

}
