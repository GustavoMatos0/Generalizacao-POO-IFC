package animal;

public class Gato extends Mamifero {
    private String raca;
    private boolean adotado;
    
    public Gato(boolean pelos, String habitat, float peso, int idade, int membros) {
        super(pelos, habitat, peso, idade, membros);
    }

    public Gato(String raca, boolean adotado, boolean pelos, String habitat, float peso, int idade, int membros) {
        super(pelos, habitat, peso, idade, membros);
        this.raca = raca;
        this.adotado = adotado;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        if(raca.length() > 0)
        this.raca = raca;
    }

    public boolean isAdotado() {
        return adotado;
    }

    public void setAdotado(boolean adotado) {
        this.adotado = adotado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Gato{");
        sb.append("raca=").append(raca);
        sb.append(", adotado=").append(adotado);
        sb.append('}');
        return sb.toString();
    }
    
    
}
