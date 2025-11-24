public class Array {
    public static void main(String[] args) {
        // Declaração de Array
//        int [] numeros = {10, 20, 30};
//        String [] frutas;

        //INICIALIZAR
        //frutas = new String[]{"Maça", "Morango", "Pera"};
        double [] salario = new double[5];
        salario[3] = 500.00;
        salario[1] = 200.00;
        salario[2] = 100.00;
        salario[4] = 200.00;

        for (int posicao = 0; posicao < salario.length; posicao ++) {
            System.out.println(salario[posicao]);
            System.out.print("===================================================================");
        }

        for (double salarios : salario) {
            System.out.println(salarios);
        }

    }
}
