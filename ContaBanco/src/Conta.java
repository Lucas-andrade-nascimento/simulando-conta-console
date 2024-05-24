public class Conta {

    private String nomeCliente;
    private String agencia;
    private int numero;
    private double saldo;

    public Conta(String nomeCliente, String agencia, int numero, double saldo) {
        this.nomeCliente = nomeCliente;
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getNome() {
        return nomeCliente;
    }

    public void setNome(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Ola "
                + nomeCliente
                + ", Obrigado por criar sua conta em nosso banco, sua agência é: "
                + agencia
                + ", conta: "
                + numero
                + ", e seu saldo de "
                + saldo
                + " já está disponível para saque.";
    }

}
