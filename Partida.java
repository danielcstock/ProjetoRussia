import java.util.LinkedList;

public class Partida {

    private LinkedList<Time> Times;

    public Partida(LinkedList<Time> lista){
        if(lista != null){
            this.Times = lista;
        }
    }

    public Time JogarPartida() {
        DistribuirCartoes();
        return null;
    }

    protected void DistribuirCartoes() {
        Time A;
        for(int i = 0; i < Times.size(); i++){
            A = Times.get(i);
            
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

    public void ConfigurarPartida(Time A, Time B) {
        Times.add(A);
        Times.add(B);
    }
}
