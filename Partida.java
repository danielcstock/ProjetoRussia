import java.util.LinkedList;

public class Partida {

    private LinkedList<Time> Times;

    public Partida(LinkedList<Time> ListaTimes){
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
        DistribuirCartoes();
        return null;
    }

    protected void DistribuirCartoes() {
        Time A;
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

    protected void DisputarPenaltis() {
        
    }

    protected void OrdenarTimes(Time V, Time P) {
        Times.remove(V);
        Times.remove(P);
        Times.addLast(V);
        Times.addFirst(P);
    }
}
