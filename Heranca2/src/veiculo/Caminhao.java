package veiculo;

public class Caminhao extends Veiculo {
    private int eixos;

    public Caminhao(int eixos, boolean motor) {
        super(motor);
        this.eixos = eixos;
    }

    public Caminhao(boolean motor) {
        super(motor);
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        if(eixos > 0)
        this.eixos = eixos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Caminhao{");
        sb.append("eixos=").append(eixos);
        sb.append('}');
        return sb.toString();
    }
    
    
}
