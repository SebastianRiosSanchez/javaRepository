import Exceptions.CalculadoraException;

public class Calculadora {

    public int dividir(int dividendo, int divisor) throws CalculadoraException {
        if (divisor == 0) {
            throw new CalculadoraException("No es posible dividir entre cero...");
        }
        return dividendo / divisor;
    }

}
