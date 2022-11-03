package simples;

public class Conta {

    private String banco;
    private int agencia;
    private int numconta;
    private double saldo;

    public Conta(String banco, int agencia, int numconta, double saldo) {
        this.banco = banco;
        this.agencia = agencia;
        this.numconta = numconta;
        this.saldo = saldo;
    }

    public Conta() {
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        if(banco.length() > 0)
        this.banco = banco;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumconta() {
        return numconta;
    }

    public void setNumconta(int numconta) {
        this.numconta = numconta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Conta{");
        sb.append("banco=").append(banco);
        sb.append(", agencia=").append(agencia);
        sb.append(", numconta=").append(numconta);
        sb.append(", saldo=").append(saldo);
        sb.append('}');
        return sb.toString();
    }

    public void deposito(double valor) {
        if(valor > 0)
        this.setSaldo(this.getSaldo() + valor);
    }

    public void saque(double valor) {
        if(this.getSaldo()>0 && this.getSaldo()>=valor)
        this.setSaldo(this.getSaldo() - valor);
    }
}
