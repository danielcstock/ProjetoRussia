import java.util.LinkedList;

public class PartidaGrupo implements Partida{

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

    public PartidaGrupo(LinkedList<Time> ListaTimes){
        try{
            Times = new LinkedList();
            this.Times.add(ListaTimes.get(0));
            this.Times.add(ListaTimes.get(1));
        } catch(Exception excecao){
            /* Utilizar ExceptionInitializarError ou Exception?*/
            System.out.println("FALHA NA CONSTRUÇÃO DO OBJETO 'Partida'.");
            System.out.println(excecao.getMessage());
        }
    }
    
    public Time JogarPartida() {
        int p1, p2;
        GeradorProbabilidade gp = new GeradorProbabilidade();
        //DistribuirCartoes();
        
        return null;
    }

    private void DistribuirCartoes(Time A, Time B){
        GeradorProbabilidade gp = new GeradorProbabilidade();
        int p, cartoesAmarelos, cartoesVermelhos;
        for(int i = 0; i < Times.size(); i++){
            A = Times.get(i);
            p = gp.CalcularProbabilidade(A.getProbabilidadeCartoes());
            cartoesVermelhos = p%2;
            cartoesAmarelos = p - cartoesVermelhos;
            System.out.println("Cartoes amarelos: " + cartoesAmarelos);
            System.out.println("Cartoes vermelhos: " + cartoesVermelhos);
        }
    }

    @Override
    private void DisputarPenaltis() {
        throw NotImplementedException("Objeto ainda nao foi implementado.");
    }
}
