public class App {
    public static void main(String[] args) throws Exception {

        Animal nuevoAnimal = new Animal("", 10);
        Gato nuevoGato = new Gato("misifu", 12);
        Perro nuevoPerro = new Perro("Firu", 3);

        System.out.println(nuevoAnimal.hacerSonido());
        System.out.println(nuevoGato.hacerSonido());
        System.out.println(nuevoPerro.hacerSonido());

    }
}
