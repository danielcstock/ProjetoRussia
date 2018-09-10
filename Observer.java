public class Observer {
    private Partida P;

    public Observer(Partida partida){
        try {
            this.P = partida;
        } catch (ExceptionInInitializerError excecao){
            throw excecao;
        }
    }

    public void notificarTime(Time T, int CartoesAmarelos, int CartoesVermelhos){
        
    }
}