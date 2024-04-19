public class App {
    public static void main(String[] args) throws Exception {

        Delfin delfin = new Delfin("El flipper");
        Pulpo pulpo = new Pulpo("El Octopus", 8);

        delfin.nadar();
        delfin.comunicarse();
        delfin.alimentar();

        pulpo.nadar();
        pulpo.comunicarse();
        pulpo.alimentar();

    }
}
