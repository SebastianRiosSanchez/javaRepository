public class Persona {

    private String nombre;
    private String apellido;
    private int edad;

    // Constructor de clase vacío
    public Persona() {

    }

    // Contructor de clase con parámetros
    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    // Métodos de Clase

    public String saludar() {
        return "Hola, mi nombre es " + nombre + " " + apellido;
    }

    public String enviarSaludo(String saludo) {
        if (edad > 18)
            return "Tenga usted un buen día";
        return "Hola, ¿Cómo estás " + saludo + "?";
    }

    // GETTERS Y SETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
