import java.util.LinkedList;

public class PartidaMataMata extends Partida {

    @Override
    public Placar JogarPartida(int TimeA, int TimeB) {
        int p1, p2;
        GeradorProbabilidade gp = new GeradorProbabilidade();
        //DistribuirCartoes();
        
        return null;
    }

    @Override
    public Partida setTimes(LinkedList<Time> ListaTimes){
        try{
            Times = new LinkedList();
            this.Times.add(ListaTimes.get(0));
            this.Times.add(ListaTimes.get(1));
        } catch(Exception excecao){
            System.out.println();
        }
        return this;
    }

    private void DisputarPenaltis(){
        int i = 0;

    }

    @Override
    public void RodarFase(){

    }
}
