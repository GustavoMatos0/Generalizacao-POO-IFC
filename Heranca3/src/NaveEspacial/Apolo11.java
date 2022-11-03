package NaveEspacial;

public class Apolo11 extends NaveEspacial {

    private String tipoCombus;

    public Apolo11(double velocidadeMax) {
        super(velocidadeMax);
    }

    public Apolo11(String tipoCombus, double velocidadeMax) {
        super(velocidadeMax);
        this.tipoCombus = tipoCombus;
    }

    public String getTipoCombus() {
        return tipoCombus;
    }

    public void setTipoCombus(String tipoCombus) {
        this.tipoCombus = tipoCombus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Apolo11{");
        sb.append("tipoCombus=").append(tipoCombus);
        sb.append('}');
        return sb.toString();
    }

}
