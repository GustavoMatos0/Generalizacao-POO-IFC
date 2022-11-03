package veiculo;

public class Carro extends Veiculo {
    private int portas;

    public Carro(int portas, boolean motor) {
        super(motor);
        this.portas = portas;
    }

    public Carro(boolean motor) {
        super(motor);
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        if(portas > 0)
        this.portas = portas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Carro{");
        sb.append("portas=").append(portas);
        sb.append('}');
        return sb.toString();
    }
    
    
}
