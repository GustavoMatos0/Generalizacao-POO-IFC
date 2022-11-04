package PecasDeXadrez;

public class Peca {

    private int linha;
    private int coluna;
    private boolean cor;
    private int movimentos;

    public Peca(int linha, int coluna, boolean cor, int movimentos) {
        this.linha = linha;
        this.coluna = coluna;
        this.cor = cor;
        this.movimentos = movimentos;
    }

    public Peca() {
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        if (linha > 0) {
            this.linha = linha;
        }
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        if (coluna > 0) {
            this.coluna = coluna;
        }
    }

    public boolean isCor() {
        return cor;
    }

    public void setCor(boolean cor) {
        this.cor = cor;
    }

    public int getMovimentos() {
        return movimentos;
    }

    public void setMovimentos(int movimentos) {
        if (movimentos > 0) {
            this.movimentos = movimentos;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Peca{");
        sb.append("linha=").append(linha);
        sb.append(", coluna=").append(coluna);
        sb.append(", cor=").append(cor);
        sb.append(", movimentos=").append(movimentos);
        sb.append('}');
        return sb.toString();
    }
    
    
}
