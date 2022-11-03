package Ambiente;

public class Banheiro extends Ambiente {

    private boolean banheira;

    public Banheiro(float area) {
        super(area);
    }

    public Banheiro(boolean banheira, float area) {
        super(area);
        this.banheira = banheira;
    }

    public boolean isBanheira() {
        return banheira;
    }

    public void setBanheira(boolean banheira) {
        this.banheira = banheira;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Banheiro{");
        sb.append("banheira=").append(banheira);
        sb.append('}');
        return sb.toString();
    }

}
