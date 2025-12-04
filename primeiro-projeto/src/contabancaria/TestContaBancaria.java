package contabancaria;

public class TestContaBancaria {
    public static void main(String[] args) {
        System.out.println("--- Teste ContaBancaria ---");

        // Caso 1: depósito válido
        ContaBancaria c1 = new ContaBancaria("Alice", 100.0);
        System.out.println("Saldo inicial c1: " + c1.getSaldo());
        c1.depositar(50.0);
        System.out.println("Após depositar 50.0, saldo c1: " + c1.getSaldo());

        // Caso 2: depósito negativo (deve lançar IllegalArgumentException)
        ContaBancaria c2 = new ContaBancaria("Bob", 20.0);
        try {
            System.out.println("Tentando depositar -10.0 em c2 (espera exceção)");
            c2.depositar(-10.0);
            System.out.println("ERRO: depósito negativo não lançou exceção");
        } catch (IllegalArgumentException ex) {
            System.out.println("Exceção esperada para depósito negativo: " + ex.getMessage());
        }

        // Caso 3: saque válido
        boolean saqueOK = c1.sacar(30.0);
        System.out.println("Saque de 30.0 em c1 foi bem-sucedido? " + saqueOK + "; saldo agora: " + c1.getSaldo());

        // Caso 4: saque maior que saldo (deve retornar false e não alterar o saldo)
        double saldoAntes = c2.getSaldo();
        boolean saqueMaior = c2.sacar(100.0);
        System.out.println("Tentativa de saque de 100.0 em c2 sucesso? " + saqueMaior + "; saldo antes: " + saldoAntes + ", depois: " + c2.getSaldo());

        // Caso 5: transferência válida
        ContaBancaria c3 = new ContaBancaria("Carlos", 200.0);
        ContaBancaria c4 = new ContaBancaria("Diana", 50.0);
        System.out.println("Antes: c3=" + c3 + " c4=" + c4);
        boolean transferencia = c3.transferirPara(c4, 75.0);
        System.out.println("Transferência c3->c4 de 75.0 sucesso? " + transferencia);
        System.out.println("Depois: c3=" + c3 + " c4=" + c4);

        // Caso 6: transferência para null (deve lançar IllegalArgumentException)
        try {
            System.out.println("Tentando transferir para null (espera exceção)");
            c3.transferirPara(null, 10.0);
            System.out.println("ERRO: transferencia para null não lançou exceção");
        } catch (IllegalArgumentException ex) {
            System.out.println("Exceção esperada para transferência para null: " + ex.getMessage());
        }

        // Caso 7: saque com valor <= 0 (deve lançar IllegalArgumentException)
        try {
            System.out.println("Tentando sacar 0.0 em c3 (espera exceção)");
            c3.sacar(0.0);
            System.out.println("ERRO: saque com valor 0 não lançou exceção");
        } catch (IllegalArgumentException ex) {
            System.out.println("Exceção esperada para saque com 0: " + ex.getMessage());
        }

        System.out.println("--- Fim dos testes ---");
    }
}
