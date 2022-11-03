package simples;

public class ContaSimples extends Conta {

    private double saldoPoupanca;

    public ContaSimples(String banco, int agencia, int numconta, double saldo) {
        super(banco, agencia, numconta, saldo);
    }

    public ContaSimples(double saldoPoupanca, String banco, int agencia, int numconta, double saldo) {
        super(banco, agencia, numconta, saldo);
        this.saldoPoupanca = saldoPoupanca;
    }

    public double getSaldoPoupanca() {
        return saldoPoupanca;
    }

    public void setSaldoPoupanca(double saldoPoupanca) {
        this.saldoPoupanca = saldoPoupanca;
    }

    public void depositoPoupanca(double valor) {
        if (valor > 0) {
            this.setSaldoPoupanca(this.getSaldoPoupanca() + valor);
        }
    }

    public void saquePoupanca(double valor) {
        if (valor > 0 && this.getSaldo() >= valor) {
            this.setSaldo(this.getSaldo() - valor);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("ContaSimples{");
        sb.append("saldoPoupanca=").append(saldoPoupanca);
        sb.append('}');
        return sb.toString();
    }

}
