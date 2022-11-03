package item;

public class Vhs extends Midia {
    private String titulo;

    public Vhs(String titulo, String gravadora, float duracao, int cod, String desc) {
        super(gravadora, duracao, cod, desc);
        this.titulo = titulo;
    }

    public Vhs(String gravadora, float duracao, int cod, String desc) {
        super(gravadora, duracao, cod, desc);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if(titulo.length() > 0)
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Vhs{");
        sb.append("titulo=").append(titulo);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
}
