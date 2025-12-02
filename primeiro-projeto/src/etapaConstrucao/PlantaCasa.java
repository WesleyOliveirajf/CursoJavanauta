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

    public int somaMetragem(){
        return metragem * numeroBanheiros + numeroQuartos;

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

        int resultado = casa.somaMetragem();
    }
}
