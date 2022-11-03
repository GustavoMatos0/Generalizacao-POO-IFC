package animal;

public class Mamifero extends Animal {

    private boolean pelos;
    private String habitat;

    public Mamifero(boolean pelos, String habitat, float peso, int idade, int membros) {
        super(peso, idade, membros);
        this.pelos = pelos;
        this.habitat = habitat;
    }

    public Mamifero(float peso, int idade, int membros) {
        super(peso, idade, membros);
    }

    public boolean isPelos() {
        return pelos;
    }

    public void setPelos(boolean pelos) {
        this.pelos = pelos;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        if(habitat.length() > 0)
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Mamifero{");
        sb.append("pelos=").append(pelos);
        sb.append(", habitat=").append(habitat);
        sb.append('}');
        return sb.toString();
    }

}
