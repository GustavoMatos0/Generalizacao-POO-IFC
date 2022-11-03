package animal;

public class Animal {
    private float peso;
    private int idade;
    private int membros;

    public Animal(float peso, int idade, int membros) {
        this.peso = peso;
        this.idade = idade;
        this.membros = membros;
    }

    public Animal() {
    }
    

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        if(peso >0)
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade > 0)
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Animal{");
        sb.append("peso=").append(peso);
        sb.append(", idade=").append(idade);
        sb.append(", membros=").append(membros);
        sb.append('}');
        return sb.toString();
    }
    
    
}
