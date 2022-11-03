package pessoa;

public class PessoaFisica extends Pessoa {

    private String cpf;
    private String estadociv;
    
    public PessoaFisica(String nome, String endereco) {
        super(nome, endereco);
    }

    public PessoaFisica(String cpf, String estadociv, String nome, String endereco) {
        super(nome, endereco);
        this.cpf = cpf;
        this.estadociv = estadociv;
    }

  
    public String getEstadociv() {
        return estadociv;
    }

    public void setEstadociv(String estadociv) {
        if(estadociv.length() > 0)
        this.estadociv = estadociv;
    }
    
    
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" PessoaFisica{");
        sb.append("cpf=").append(cpf);
        sb.append('}');
        return sb.toString();
    }

}
