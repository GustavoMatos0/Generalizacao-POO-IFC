package Ambiente;

public class Quarto extends Ambiente {

    private int capacidade;

    public Quarto(float area) {
        super(area);
    }

    public Quarto(int capacidade, float area) {
        super(area);
        this.capacidade = capacidade;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        if(capacidade > 0)
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Quarto{");
        sb.append("capacidade=").append(capacidade);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
