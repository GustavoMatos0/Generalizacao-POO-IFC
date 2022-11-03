package item;

public class Cd extends Midia {
    private int faixa;
    private String artista;
    private String album;

    public Cd(int faixa, String artista, String album, String gravadora, float duracao, int cod, String desc) {
        super(gravadora, duracao, cod, desc);
        this.faixa = faixa;
        this.artista = artista;
        this.album = album;
    }

    public Cd(String gravadora, float duracao, int cod, String desc) {
        super(gravadora, duracao, cod, desc);
    }

    public int getFaixa() {
        return faixa;
    }

    public void setFaixa(int faixa) {
        if(faixa > 0)
        this.faixa = faixa;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        if(artista.length() > 0)
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        if(album.length() > 0)
        this.album = album;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Cd{");
        sb.append("faixa=").append(faixa);
        sb.append(", artista=").append(artista);
        sb.append(", album=").append(album);
        sb.append('}');
        return sb.toString();
    }
    
    
}
