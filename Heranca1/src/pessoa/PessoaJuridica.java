package pessoa;

public class PessoaJuridica extends Pessoa {
    private String cnpj;
    private String tipoEmpresa;

    public PessoaJuridica(String cnpj, String tipoEmpresa, String nome, String endereco) {
        super(nome, endereco);
        this.cnpj = cnpj;
        this.tipoEmpresa = tipoEmpresa;
    }

    public PessoaJuridica(String nome, String endereco) {
        super(nome, endereco);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        if(cnpj.length() > 0);
        this.cnpj = cnpj;
    }

    public String getTipoEmpresa() {
        return tipoEmpresa;
    }

    public void setTipoEmpresa(String tipoEmpresa) {
        if(tipoEmpresa.length() > 0)
        this.tipoEmpresa = tipoEmpresa;
    }
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("PessoaJuridica{");
        sb.append("cnpj=").append(cnpj);
        sb.append(", tipoEmpresa=").append(tipoEmpresa);
        sb.append('}');
        return sb.toString();
    }


    
}
