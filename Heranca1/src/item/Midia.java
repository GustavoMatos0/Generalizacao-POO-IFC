package item;

public class Midia extends Item {

    private String gravadora;
    private float duracao;

    public Midia(String gravadora, float duracao, int cod, String desc) {
        super(cod, desc);
        this.gravadora = gravadora;
        this.duracao = duracao;
    }

    public Midia(int cod, String desc) {
        super(cod, desc);
    }

    public String getGravadora() {
        return gravadora;
    }

    public void setGravadora(String gravadora) {
        if (gravadora.length() > 0) {
            this.gravadora = gravadora;
        }
    }

    public float getDuracao() {
        return duracao;
    }

    public void setDuracao(float duracao) {
        if (duracao > 0) {
            this.duracao = duracao;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Midia{");
        sb.append("gravadora=").append(gravadora);
        sb.append(", duracao=").append(duracao);
        sb.append('}');
        return sb.toString();
    }

}
