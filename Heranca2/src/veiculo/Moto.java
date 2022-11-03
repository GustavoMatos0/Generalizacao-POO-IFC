package veiculo;

public class Moto extends Veiculo {

    private int cil;

    public Moto(int cil, boolean motor) {
        super(motor);
        this.cil = cil;
    }

    public Moto(boolean motor) {
        super(motor);
    }

    public int getCil() {
        return cil;
    }

    public void setCil(int cil) {
        if (cil > 0) {
            this.cil = cil;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Moto{");
        sb.append("cil=").append(cil);
        sb.append('}');
        return sb.toString();
    }

}
