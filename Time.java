import java.util.LinkedList;

public class Time {

    private String Nome;
    private LinkedList<Esportista> Jogadores;
    private Double ProbabilidadeGols;
    private Double ProbabilidadeCartoes;
    private int Pontos;

    public Time setNome(String Nome){
        try{
            this.Nome = Nome;
            return this;
        } catch(ExceptionInInitializerError e){
            throw e;
        }
    }

    public Time setJogadores(LinkedList<Esportista> Jogadores){
        try{
            this.Jogadores = Jogadores;
            return this;
        } catch(ExceptionInInitializerError e){
            throw e;
        }
    }

    public void setProbabilidades(double probGols, double probCartoes){
        ProbabilidadeGols = probGols;
        ProbabilidadeCartoes = probCartoes;
    }
    
    public void setPontos(int p){
        if(p >= 0){
            this.Pontos = p;
        }
    }

    public double getProbabilidadeGols(){
        return this.ProbabilidadeGols;
    }
    
    public double getProbabilidadeCartoes(){
        return this.ProbabilidadeCartoes;
    }
    
    public String getNome(){
        return this.Nome;
    }
    
    public int getPontos(){
        return this.Pontos;
    }

    public LinkedList<Esportista> getJogadores(){
        return this.Jogadores;
    }

    public void calcularProbabilidadeGols(){
        double somaDasProbabilidades = 0;
        for (int i = 0; i<this.Jogadores.size(); i++){
            somaDasProbabilidades += this.Jogadores.get(i).getProbabilidadeGols();
        }
        somaDasProbabilidades /= this.Jogadores.size();
        this.ProbabilidadeGols = somaDasProbabilidades;
    }

    public void calcularProbabilidadeCartoes(){
        double somaDasProbabilidades = 0;
        for (int i = 0; i<this.Jogadores.size(); i++){
            somaDasProbabilidades += this.Jogadores.get(i).getProbabilidadeCartoes();
        }
        somaDasProbabilidades /= this.Jogadores.size();
        this.ProbabilidadeCartoes = somaDasProbabilidades;
    }
}
