package contabancaria;

public class Agencia {
    public static void main(String[] args) {
        ContaBancaria minhaConta = new ContaBancaria("Wesley", 500);

        minhaConta.setTitular("Wesley Oliveira"); // Alterar nome
        minhaConta.setSaldo(minhaConta.getSaldo() + 500); // acresentar saldo

        String titularConta = minhaConta.getTitular();
        double saldoFinal = minhaConta.getSaldo();

        System.out.println("O titular da conta e: "+ titularConta);
        System.out.println("e o Saldo e: "+ saldoFinal);


        ContaBancaria contaMinhaMae = new ContaBancaria("Maria");
        System.out.println("A conta da minha mae e: "+ contaMinhaMae.getTitular() + " , o saldo e: " + contaMinhaMae.getSaldo());



    }



}
