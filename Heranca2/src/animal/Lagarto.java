package animal;

public class Lagarto extends Reptil {

    private String especie;

    public Lagarto(boolean agressivo, String habitat, String alimentacao, float peso, int idade, int membros) {
        super(agressivo, habitat, alimentacao, peso, idade, membros);
    }

    public Lagarto(String especie, float peso, int idade, int membros) {
        super(peso, idade, membros);
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        if(especie.length() > 0)
        this.especie = especie;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Lagarto{");
        sb.append("especie=").append(especie);
        sb.append('}');
        return sb.toString();
    }
    
    

}
