public class Animal {

    String nombre;
    int edad;
    static int contadorAnimales = 0;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        contadorAnimales++;
    }

    public String hacerSonido() {
        return "Animal hace un sonido genérico...";
    }

    // Método de tipo static para acceder al atributo static
    public static int getContadorAnimales() {
        return contadorAnimales;
    }
}
