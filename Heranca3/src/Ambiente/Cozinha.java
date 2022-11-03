package Ambiente;

public class Cozinha extends Ambiente {

    private boolean microondas;

    public Cozinha(float area) {
        super(area);
    }

    public Cozinha(boolean microondas, float area) {
        super(area);
        this.microondas = microondas;
    }

    public boolean isMicroondas() {
        return microondas;
    }

    public void setMicroondas(boolean microondas) {
        this.microondas = microondas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Cozinha{");
        sb.append("microondas=").append(microondas);
        sb.append('}');
        return sb.toString();
    }

}
