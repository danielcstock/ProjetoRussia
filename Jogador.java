public class Jogador implements Esportista {

    private String Nome;
    private double ProbabilidadeInicialGols;
    private double ProbabilidadeInicialCartao;
    private double ProbabilidadeGols;
    private double ProbabilidadeCartao;
    private int CartaoAmarelo = 0;
    private int CartaoVermelho = 0;

    public double getProbabilidadeGols(){
        return this.ProbabilidadeGols;
    }

    public double getProbabilidadeCartoes(){
        return this.ProbabilidadeCartao;
    }

    public int getCartoesAmarelo(){
        return this.CartaoAmarelo;
    }

    public int getCartoesVermelho(){
        return this.CartaoVermelho;
    }
    
    public Jogador setNome(String nome){
        try{
            this.Nome = nome;
            return this;
        } catch(ExceptionInInitializerError e){
            throw e;
        }
    }
    
    public Jogador setProbabilidadeGols(double prob){
        try{
            this.ProbabilidadeInicialGols = prob;
            this.ProbabilidadeGols = prob;
            return this;
        } catch(ExceptionInInitializerError e){
            throw e;
        }
    }

    public Jogador setCartaoAmarelo(int Cartao){
        this.CartaoAmarelo += Cartao;
        return this;
    }

    public Jogador setCartaoVermelho(int Cartao){
        this.CartaoVermelho += Cartao;
        return this;
    }
    
    public Jogador setProbabilidadeCartao(double prob){
        try{
            this.ProbabilidadeInicialCartao = prob;
            this.ProbabilidadeCartao = prob;
            return this;
        } catch (ExceptionInInitializerError e){
            throw e;
        }
    }
}    