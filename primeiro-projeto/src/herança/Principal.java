package herança;

public class Principal {
    public static void main(String[] args) {

        Cachorro caramelo = new Cachorro();
        caramelo.latir();
        caramelo.comer("pao");
        caramelo.beberAgua();
        caramelo.dormir();

        System.out.println("==============================================================================");

        Galinha cocorico = new Galinha();
        cocorico.cisca();
        cocorico.comer("Milho");



    }
}
