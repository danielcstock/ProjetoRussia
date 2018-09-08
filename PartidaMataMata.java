import java.util.LinkedList;

import jdk.jshell.spi.ExecutionControl.NotImplementedException;

public class PartidaMataMata implements Partida {

    private LinkedList<Time> Times;

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
    
    public Time JogarPartida() {
        int p1, p2;
        GeradorProbabilidade gp = new GeradorProbabilidade();
        DistribuirCartoes();
        
        return null;
    }

    @Override
    private void DisputarPenaltis() {
        throw NotImplementedException("Objeto ainda nao foi implementado.");
    }
}
