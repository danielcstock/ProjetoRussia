import java.util.LinkedList;

public class PartidaGrupo extends Partida{
    
    @Override
    public Time JogarPartida() {
        int p1, p2;
        GeradorProbabilidade gp = new GeradorProbabilidade();
        DistribuirCartoes(this.Times.get(0), this.Times.get(1));
        return null;
    }
}
