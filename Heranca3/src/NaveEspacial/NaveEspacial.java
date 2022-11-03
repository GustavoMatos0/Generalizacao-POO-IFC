package NaveEspacial;

public class NaveEspacial {

    private double velocidadeMax;

    public NaveEspacial(double velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

    public NaveEspacial() {
    }

    public double getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(double velocidadeMax) {
        if (velocidadeMax > 0) {
            this.velocidadeMax = velocidadeMax;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NaveEspacial{");
        sb.append("velocidadeMax=").append(velocidadeMax);
        sb.append('}');
        return sb.toString();
    }

}
