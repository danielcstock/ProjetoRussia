import java.util.LinkedList;

public interface Partida {
    
    public LinkedList<Time> Times = null;

    public Partida setTimes(LinkedList<Time> ListaTimes);

    public Time JogarPartida();

    public void DistribuirCartoes(Time A, Time B);

    public void DisputarPenaltis();

    public void OrdenarTimes(Time V, Time P);
}
