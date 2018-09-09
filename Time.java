import java.util.LinkedList;

public class Time {

    private String Nome;
    private LinkedList<Esportista> Jogadores;
    private Double ProbabilidadeGols;
    private Double ProbabilidadeCartoes;
    private int Pontos;

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

    public void calcularProbabilidade(LinkedList<Esportista> listaEsportistas){
        double somaDasProbabilidades=0;
        for (int i = 0; i<listaEsportistas.size(); i++){
            somaDasProbabilidades += listaEsportistas.get(i).getProbabilidadeGols();
        }
        somaDasProbabilidades /= 11; // sem jogadores reservas
        this.ProbabilidadeGols = somaDasProbabilidades;
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
}
