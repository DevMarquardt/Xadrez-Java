import java.util.ArrayList;

public abstract class Peca {
    private String cor;
    private Posicao posicao;

    public Posicao getPosicao() {
        return posicao;
    }

    public void mover(
            Tabuleiro tabuleiro,
            Posicao posicao){
        ArrayList<Posicao> possiveisPosicoes = possiveisMovimentos(tabuleiro);
        for (Posicao posicaoPossivel:possiveisPosicoes){
            if (posicaoPossivel == posicao){
                //atribuindo a peça para a nova posição no tabuleiro
                posicao.setPeca(this);
                //removendo a peça da posição anterior no tabuleiro
                this.posicao.setPeca(null);
                //trocando a posição atual da peça no tabuleiro
                this.posicao = posicao;
                break;
            }
        }
    }
    public abstract
    ArrayList<Posicao>
    possiveisMovimentos(
            Tabuleiro tabuleiro);
}
