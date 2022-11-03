package item;

public class Livro extends Item {
    private String autor;

    public Livro(String autor, int cod, String desc) {
        super(cod, desc);
        this.autor = autor;
    }

    public Livro(int cod, String desc) {
        super(cod, desc);
    }

    public String getAtor() {
        return autor;
    }

    public void setAtor(String ator) {
        if(ator.length() > 0)
        this.autor = ator;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Livro{");
        sb.append("ator=").append(autor);
        sb.append('}');
        return sb.toString();
    }
    
    
}
