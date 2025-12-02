package etapaConstrucao;

public class PlantaCasa {
    //Atributos
    public int metragem;
    public  int numeroQuartos;
    public  int numeroBanheiros;
    public  String cor;
    public  String material;

    public void construir(){
        System.out.println("A casa foi construida as caracteristica são: ");
        System.out.println("Metragem " + metragem);
        System.out.println("Numero de quartos " + numeroQuartos);
        System.out.println("Numero de banheiros " + numeroBanheiros);
        System.out.println("Material " + material);
        System.out.println(" A metragem da Casa é: "+ somaMetragem());
    }

    public void pintar(){
        System.out.println("A casa foi pintada de:  " + cor);
    }

    public void mudarCorParede(String novacor){
        cor = novacor;
        pintar();
    }

    public int somaMetragem(){
        return metragem * numeroBanheiros + numeroQuartos;

    }

    public void alterarCaracteristicas(int metros, int quartos, int banheiros, String mat){
        metragem = metros;
        numeroQuartos = quartos;
        numeroQuartos = banheiros;
        material = mat;

        construir();

    }

    public static void main(String[] args) {
        //Criando o objeto casa
        PlantaCasa casa = new PlantaCasa();

        //Inicializando os atributos (variáveis) (características) casa
        casa.numeroBanheiros = 2;
        casa.numeroQuartos = 3;
        casa.metragem = 70;
        casa.material = "Tijolo";
        casa.cor = "Cinza";

        casa.construir();

        casa.pintar();

        casa.mudarCorParede("Branco");

        casa.alterarCaracteristicas(100, 2, 2 , "Madeiras");

        int resultado = casa.somaMetragem();

        PlantaCasa casaVizinho = new PlantaCasa();
        casaVizinho.metragem = 200;
        casaVizinho.material = "Alvenaria";
        casaVizinho.numeroBanheiros = 1;
        casaVizinho.numeroQuartos = 1;
        casaVizinho.cor = "Azul";

        System.out.println("==========================");
        casaVizinho.construir();
        casaVizinho.pintar();
    }
}
