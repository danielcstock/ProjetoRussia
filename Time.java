import java.util.LinkedList;

public class Time {

    private String Nome;
    private LinkedList Esportista;
    private int Probabilidade;

    public void calcularProbabilidade(LinkedList<Esportista> listaEsportistas){
        int somaDasProbabilidas=0;
        for (int i=0; i<listaEsportistas.size(); i++){
            somaDasProbabilidas+=listaEsportistas.get(i).getProbabilidade();
        }
        somaDasProbabilidas/=11; // sem jogadores reservas
        this.Probabilidade=somaDasProbabilidas;
    }

}
