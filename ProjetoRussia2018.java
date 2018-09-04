import java.util.LinkedList;
public class ProjetoRussia2018 {
    public static void main(String[] args) {
        LinkedList<Time> t = new LinkedList();
        Time a = new Time(), b = new Time();
        a.setProbabilidades(6.5, 4.3);
        b.setProbabilidades(4.9, 5.3);
        t.add(a);
        t.add(b);
        Partida p = new Partida(t);
        p.JogarPartida();
    }
    
}
