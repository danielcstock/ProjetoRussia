import java.util.LinkedList;

public abstract class Fase {

    private LinkedList<Time> Lista;
    private Partida Jogo;

    public Fase(Fase f) {
    }

    public Fase() {
    }

    public abstract void IniciarFase();

    protected LinkedList<Time> EncerrarFase() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    protected void OrdenarTimes() {
    }
}
