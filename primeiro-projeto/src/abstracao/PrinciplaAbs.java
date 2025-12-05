package abstracao;

public class PrinciplaAbs {
    public static void main(String[] args) {
        Funcionario joao = new Funcionario("Rua das Flores","Juiz de Fora","14", "MG",  "36035200","Wesley",
                "1456666","TI");
        Cliente joana = new Cliente("Rua das margarida", "Rio", "RJ", "36054879", "Joana", "00054444");

        System.out.println(joao);
        System.out.println(joana);
    }
}
