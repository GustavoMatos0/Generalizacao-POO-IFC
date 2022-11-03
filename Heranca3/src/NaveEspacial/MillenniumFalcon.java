package NaveEspacial;

public class MillenniumFalcon extends Apolo11 {

    private float classeHiperpropulsor;

    public MillenniumFalcon(double velocidadeMax) {
        super(velocidadeMax);
    }

    public MillenniumFalcon(float classeHiperpropulsor, double velocidadeMax) {
        super(velocidadeMax);
        this.classeHiperpropulsor = classeHiperpropulsor;
    }

    public float getClasseHiperpropulsor() {
        return classeHiperpropulsor;
    }

    public void setClasseHiperpropulsor(float classeHiperpropulsor) {
        this.classeHiperpropulsor = classeHiperpropulsor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("MillenniumFalcon{");
        sb.append("classeHiperpropulsor=").append(classeHiperpropulsor);
        sb.append('}');
        return sb.toString();
    }

}
