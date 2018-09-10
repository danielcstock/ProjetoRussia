import java.util.LinkedList;

public class PartidaGrupo extends Partida{
    
    @Override
    public Placar JogarPartida(int TimeA, int TimeB) {
        Placar p;
        GeradorProbabilidade gp = new GeradorProbabilidade();
        DistribuirCartoes(this.Times.get(TimeA), this.Times.get(TimeB));
        p = MarcarGols(this.Times.get(TimeA), this.Times.get(TimeB));
        return p;
    }

    @Override
    public Partida setTimes(LinkedList<Time> ListaTimes) {
        try{
            Times = new LinkedList();
            this.Times.add(ListaTimes.get(0));
            this.Times.add(ListaTimes.get(1));
        } catch(Exception excecao){
            
        }
        return this;
    }

    @Override
    public void RodarFase(){
        Placar placar;
        for(int i = 0; i < 3; i++){
            for(int j = (i+1); j < 3; j++){
                placar = JogarPartida(i, j);
            }
        }
    }
}
