import java.util.LinkedList;

public class Time {

    private String Nome;
    private LinkedList Esportista;
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

    public void calcularProbabilidade(LinkedList<Esportista> listaEsportistas){
        double somaDasProbabilidas=0;
        for (int i = 0; i<listaEsportistas.size(); i++){
            somaDasProbabilidas += listaEsportistas.get(i).getProbabilidade();
        }
        somaDasProbabilidas /= 11; // sem jogadores reservas
        this.ProbabilidadeGols = somaDasProbabilidas;
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
