import Exceptions.CalculadoraException;

public class App {
    public static void main(String[] args) throws Exception {
        // Excepciones: eventos que interrumpen el flujo normal de una aplicación.
        // Pueden ser Unchecked y Checked
        int numero = 10;
        int numero2 = 0;
        int resultado;
        Calculadora calculadora = new Calculadora();

        try {
            resultado = calculadora.dividir(numero, numero2);
            System.out.println("El resultado es: " + resultado);

        } catch (CalculadoraException e) {
            e.printStackTrace();
            // System.out.println("Esto va después de la excepción...");
        } finally {
            System.out.println("La operación de cálculo se ha finalizado, sea exitosa o no...");
        }
    }
}
