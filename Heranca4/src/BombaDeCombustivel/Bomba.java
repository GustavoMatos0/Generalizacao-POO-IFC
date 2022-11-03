package BombaDeCombustivel;

public class Bomba {

    private double totLitro;
    private float valorLitro;

    public Bomba(double totLitro, float valorLitro) {
        this.totLitro = totLitro;
        this.valorLitro = valorLitro;
    }

    public Bomba() {
    }

    public double getTotLitro() {
        return totLitro;
    }

    public void setTotLitro(double totLitro) {
        this.totLitro = totLitro;
    }

    public float getValorLitro() {
        return valorLitro;
    }

    public void setValorLitro(float valorLitro) {
        this.valorLitro = valorLitro;
    }

    public boolean abastecerLitro(int litros) {
        if (litros > 0) {
            this.setTotLitro(this.getTotLitro() + litros);
            return true;
        } else {
            return false;
        }
    }

    public boolean abastecerValor(double valor) {
        if (valor > 0 && this.valorLitro > 0) {
            this.setTotLitro(this.getTotLitro() + (valor / this.getValorLitro()));
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Bomba{");
        sb.append("totLitro=").append(totLitro);
        sb.append(", valorLitro=").append(valorLitro);
        sb.append('}');
        return sb.toString();
    }

}
