package PecasDeXadrez;

public class Peao extends Peca {

    public Peao(int linha, int coluna, boolean cor, int movimentos) {
        super(linha, coluna, cor, movimentos);
    }

    public Peao() {
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
