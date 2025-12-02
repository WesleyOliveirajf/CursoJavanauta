package contaBancaria;

public class ContaBancaria {

    // Atributos Privados
    private String titular;
    private double saldo;

    // getter e Setter - metodos padroes  para acessar e modificar os atribudos

    // Metodo para obter o titular
    public String getTitular(){
        return titular;
    }

    // Metodo para modificar o titular
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Construtor - com atributos
    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    // construtor sem Atributos
    public ContaBancaria() {}


   // construtor com 1 atributo
   public ContaBancaria(double saldo){
        this.saldo = saldo;
   }

   // construtor que inicia a conta bancaria com o saldo 0
    public ContaBancaria(String titular){
        this.titular = titular;
        this.saldo = 0;
    }


}
