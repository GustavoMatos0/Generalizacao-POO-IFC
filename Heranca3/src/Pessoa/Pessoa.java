package Pessoa;

public class Pessoa {
    private int cod;
    private String nome;
    private String endereco;

    public Pessoa(int cod, String nome, String endereco) {
        this.cod = cod;
        this.nome = nome;
        this.endereco = endereco;
    }

    public Pessoa() {
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.length() > 0)
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        if(endereco.length() > 0)
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pessoa{");
        sb.append("cod=").append(cod);
        sb.append(", nome=").append(nome);
        sb.append(", endereco=").append(endereco);
        sb.append('}');
        return sb.toString();
    }
    
    
}
