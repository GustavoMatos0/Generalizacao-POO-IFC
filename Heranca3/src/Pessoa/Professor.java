package Pessoa;

public class Professor extends Pessoa {
    private String disciplina;

    public Professor(int cod, String nome, String endereco) {
        super(cod, nome, endereco);
    }

    public Professor(String disciplina, int cod, String nome, String endereco) {
        super(cod, nome, endereco);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        if(disciplina.length() > 0)
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Professor{");
        sb.append("disciplina=").append(disciplina);
        sb.append('}');
        return sb.toString();
    }
    
    
}
