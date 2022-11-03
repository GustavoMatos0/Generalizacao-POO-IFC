package Pessoa;

public class Aluno extends Pessoa {
    private int matricula;

    public Aluno(int matricula, int cod, String nome, String endereco) {
        super(cod, nome, endereco);
        this.matricula = matricula;
    }

    public Aluno(int cod, String nome, String endereco) {
        super(cod, nome, endereco);
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Aluno{");
        sb.append("matricula=").append(matricula);
        sb.append('}');
        return sb.toString();
    }
    
    
}
