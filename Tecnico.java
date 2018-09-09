public class Tecnico implements Esportista {

    private String Nome;
    private double ProbabilidadeGols;
    private double ProbabilidadeCartao;
    private int Cartao;

    public Tecnico() {
        this.ProbabilidadeGols =(int)(Math.random() * 100); // 0 a 100
        if (this.ProbabilidadeGols < 50) {
            this.ProbabilidadeGols = 50;
        }
    }

    public double getProbabilidadeCartoes() {
        return ProbabilidadeCartao;
    }

    public double getProbabilidadeGols(){
        return ProbabilidadeGols;
    }
}
