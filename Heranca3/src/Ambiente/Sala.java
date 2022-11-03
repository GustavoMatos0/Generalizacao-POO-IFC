package Ambiente;

public class Sala extends Ambiente {

    private boolean tv;

    public Sala(float area) {
        super(area);
    }

    public Sala(boolean tv, float area) {
        super(area);
        this.tv = tv;
    }

    public boolean isTv() {
        return tv;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Sala{");
        sb.append("tv=").append(tv);
        sb.append('}');
        return sb.toString();
    }

}
