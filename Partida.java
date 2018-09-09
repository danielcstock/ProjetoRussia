import java.text.Collator;
import java.util.LinkedList;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;

public abstract class Partida {
    
    protected LinkedList<Time> Times;
    private Observer obs = new Observer();

    public Partida setTimes(LinkedList<Time> ListaTimes){
        try{
            Times = new LinkedList();
            this.Times.add(ListaTimes.get(0));
            this.Times.add(ListaTimes.get(1));
        } catch(Exception excecao){
            /* Utilizar ExceptionInitializarError ou Exception?*/
            System.out.println("FALHA NA CONSTRUÇÃO DO OBJETO 'Partida'.");
            System.out.println(excecao.getMessage());
        }
        return this;
    }

    public abstract Time JogarPartida();

    public void DistribuirCartoes(Time A, Time B){
        GeradorProbabilidade gp = new GeradorProbabilidade();
        int p, cartoesAmarelos, cartoesVermelhos;
        for(int i = 0; i < Times.size(); i++){
            A = Times.get(i);
            p = gp.CalcularProbabilidade(A.getProbabilidadeCartoes());
            cartoesVermelhos = p%2;
            cartoesAmarelos = p - cartoesVermelhos;

            obs.notificarTime(A, cartoesAmarelos, cartoesVermelhos);
        }
    }

    private void DarCartoesJogadores(Time A, int cartoesAmarelos, int cartoesVermelhos){
        LinkedList<Esportista> jogadores = A.getJogadores();
        Jogador j;
        double totalP = 0, indice;
        int i;
        for(i = 0; i < jogadores.size(); i++){
            j = (Jogador)jogadores.get(i);
            if(j.getCartoesAmarelo() < 2 && j.getCartoesVermelho() == 0){
                totalP += j.getProbabilidadeCartoes();
            }
        }
        indice = (Math.random()*totalP);
        totalP = 0;
        for(i = 0; indice > totalP; i++){
            j = (Jogador)jogadores.get(i);
            if(j.getCartoesAmarelo() < 2 && j.getCartoesVermelho() == 0){
                totalP += j.getProbabilidadeCartoes();
            }
        }
        j = (Jogador)jogadores.get(i);
        j.setCartaoAmarelo(1);
    }

    public void OrdenarTimes(Time V, Time P){
        Collections.sort(Times, new Comparator<Time>(){
            @Override
            public int compare(Time A, Time B){
                if(A.getPontos() >= B.getPontos()){
                    return A.getPontos();
                } else {
                    return B.getPontos();
                }
            }
        });
    }
}
