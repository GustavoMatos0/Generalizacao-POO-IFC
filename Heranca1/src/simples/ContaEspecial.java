package simples;

public class ContaEspecial extends Conta {

    private int diasSemJuros;
    private double limite;

    public ContaEspecial(String banco, int agencia, int numconta, double saldo) {
        super(banco, agencia, numconta, saldo);
    }

    public ContaEspecial(int diasSemJuros, double limite, String banco, int agencia, int numconta, double saldo) {
        super(banco, agencia, numconta, saldo);
        this.diasSemJuros = diasSemJuros;
        this.limite = limite;
    }

    public int getDiasSemJuros() {
        return diasSemJuros;
    }

    public void setDiasSemJuros(int diasSemJuros) {
        this.diasSemJuros = diasSemJuros;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("ContaEspecial{");
        sb.append("diasSemJuros=").append(diasSemJuros);
        sb.append(", limite=").append(limite);
        sb.append('}');
        return sb.toString();
    }

}
