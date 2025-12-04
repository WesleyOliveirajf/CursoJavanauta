package contabancaria;

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

    /**
     * Deposita um valor na conta.
     *
     * Regras:
     * - Se o valor for menor ou igual a zero, lança IllegalArgumentException.
     * - Caso contrário, adiciona ao saldo.
     *
     * @param valor valor a depositar (deve ser > 0)
     * @throws IllegalArgumentException se valor <= 0
     */
    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de depósito deve ser maior que zero: " + valor);
        }
        this.saldo += valor;
    }

    /**
     * Tenta sacar um valor da conta.
     *
     * Regras:
     * - Se o valor for menor ou igual a zero, lança IllegalArgumentException.
     * - Se houver saldo suficiente, reduz o saldo e retorna true.
     * - Se não houver saldo suficiente, não altera o saldo e retorna false.
     *
     * @param valor valor a sacar (deve ser > 0)
     * @return true se o saque foi efetuado, false se saldo insuficiente
     * @throws IllegalArgumentException se valor <= 0
     */
    public boolean sacar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de saque deve ser maior que zero: " + valor);
        }
        if (valor <= this.saldo) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    /**
     * Transfere um valor desta conta para a conta destino.
     *
     * Regras:
     * - Se destino for null, lança IllegalArgumentException.
     * - Se valor <= 0, lança IllegalArgumentException.
     * - Tenta sacar; se saque for bem-sucedido, deposita na conta destino e retorna true.
     * - Se saque falhar por saldo insuficiente, não altera nenhuma conta e retorna false.
     *
     * @param destino conta destinatária (não pode ser null)
     * @param valor valor a transferir (deve ser > 0)
     * @return true se a transferência ocorreu com sucesso, false se saldo insuficiente
     * @throws IllegalArgumentException se destino for null ou valor <= 0
     */
    public boolean transferirPara(ContaBancaria destino, double valor) {
        if (destino == null) {
            throw new IllegalArgumentException("Conta destino não pode ser null");
        }
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de transferência deve ser maior que zero: " + valor);
        }
        // Tenta sacar desta conta; se sucesso, deposita na conta destino
        if (this.sacar(valor)) {
            destino.depositar(valor);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "ContaBancaria{titular='" + titular + "', saldo=" + String.format("%.2f", saldo) + "}";
    }

}