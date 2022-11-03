package pessoa;

public class Pessoa {
    private String nome;
    private  String endereco;

    public Pessoa(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }
    
    public Pessoa(String nome) {
        setNome(nome);
        
    }

    public Pessoa() {
    }

    
    
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        if(endereco.length() > 0)
        this.endereco = endereco;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.length() > 0)
        this.nome = nome;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pessoa{");
        sb.append("nome=").append(nome);
        sb.append(", endereco=").append(endereco);
        sb.append('}');
        return sb.toString();
    }

    
    
    
}
