public class Tecnico implements Esportista {

    private String Nome;
    private int Probabilidade;
    private int Cartao;

    public Tecnico() {
        this.Probabilidade =(int)(Math.random() * 100); // 0 a 100
        if (this.Probabilidade < 50) {
            this.Probabilidade = 50;
        }
    }

    public int getProbabilidade() {
        return Probabilidade;
    }

    public void recalcularProbabilidade() {
        if (Cartao == 2) { // vermelho
            this.Probabilidade = 0;
        }
    }
}
