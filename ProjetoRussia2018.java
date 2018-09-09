import java.util.LinkedList;
public class ProjetoRussia2018 {
    public static void main(String[] args) {
        LinkedList<Time> t = new LinkedList();
        Time a = new Time(), b = new Time();
        a.setProbabilidades(6.5, 4.3);
        b.setProbabilidades(4.9, 5.3);
        t.add(a);
        t.add(b);
        Partida p = new PartidaGrupo();
        p = p.setTimes(t);
        p.JogarPartida();
        LeitorXML xmlReader = new LeitorXML();
        String[] elemPai = new String[1], atrPai = new String[1], atrFilho = new String[3], elemFilho = new String[1];
        elemPai[0] = "Time";
        atrPai[0] = "Nome";
        elemFilho[0] = "Jogador";
        atrFilho[0] = "Nome";
        atrFilho[1] = "ProbabilidadeGols";
        atrFilho[2] = "ProbabilidadeCartao";
        xmlReader
            .setArquivo("escalacao.xml")
            .setElementosPai(elemPai)
            .setAtributosPai(atrPai)
            .setElementosFilho(elemFilho)
            .setAtributosFilho(atrFilho);
        xmlReader.lerArquivo(t);
    }
    
}
