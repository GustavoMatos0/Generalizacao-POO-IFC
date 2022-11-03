package animal;

public class Reptil extends Animal {

    private boolean agressivo;
    private String habitat;
    private String alimentacao;

    public Reptil(float peso, int idade, int membros) {
        super(peso, idade, membros);
    }

    public Reptil(boolean agressivo, String habitat, String alimentacao, float peso, int idade, int membros) {
        super(peso, idade, membros);
        this.agressivo = agressivo;
        this.habitat = habitat;
        this.alimentacao = alimentacao;
    }

    public boolean isAgressivo() {
        return agressivo;
    }

    public void setAgressivo(boolean agressivo) {
        this.agressivo = agressivo;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        if (habitat.length() > 0) {
            this.habitat = habitat;
        }
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(String alimentacao) {
        if (alimentacao.length() > 0) {
            this.alimentacao = alimentacao;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Reptil{");
        sb.append("agressivo=").append(agressivo);
        sb.append(", habitat=").append(habitat);
        sb.append(", alimentacao=").append(alimentacao);
        sb.append('}');
        return sb.toString();
    }

}
