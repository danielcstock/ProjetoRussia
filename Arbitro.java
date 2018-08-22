public interface Arbitro {

    public void marcarFalta(Jogador j, Acao a);

    public void expulsarJogador(Jogador j);

    public void validarGol(Jogador j, Time t);

    public void anularGol(Jogador j, Time t);
}
