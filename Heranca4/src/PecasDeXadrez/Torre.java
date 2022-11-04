package PecasDeXadrez;

public class Torre extends Peca {

    public Torre(int linha, int coluna, boolean cor, int movimentos) {
        super(linha, coluna, cor, movimentos);
    }

    public Torre() {
    }

    public boolean mover(int linha, int coluna) {
        if (linha > 0 && coluna > 0) {
            this.setColuna(coluna);
            this.setLinha(linha);
            return true;
        } else {
            return false;
        }
    }
}
