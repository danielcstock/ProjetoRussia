package projetorussia2018;

public class Jogador implements Esportista {
    private String Nome;
    private int Probabilidade;
    private int Cartao;
    private boolean Suspenso;

    public Jogador(){
        this.Probabilidade=(int)(Math.random()*100); // 0 a 100
        this.Suspenso=false;
    }

    public int getProbabilidade() {
        return Probabilidade;
    }

    public void recalcularProbabilidade(){
        if (Cartao==1){ // amarelo
            this.Probabilidade-=5;
        }
        else if (Cartao==2){ // vermelho
            this.Probabilidade=0;
        }
    }
}
