import java.util.LinkedList;

public class ProjetoRussia2018 {
    public static void main(String[] args) {
        
        /* Leitura do arquivo com os dados de entrada */
        LinkedList<Time> ListaTimes = new LinkedList();
        LeitorXML xmlReader = new LeitorXML();
        xmlReader.setArquivo("escalacao.xml");
        ListaTimes = xmlReader.lerArquivo(ListaTimes);

        /* Inicio da fase de grupos */
        Partida p;
        for(int i = 0; i < 32; i += 4){
            p = new PartidaGrupo();
            LinkedList<Time> lista = new LinkedList<Time>();
            lista.add((Time)ListaTimes.get(i));
            lista.add((Time)ListaTimes.get(i+1));
            lista.add((Time)ListaTimes.get(i+2));
            lista.add((Time)ListaTimes.get(i+3));
            p.setTimes(lista);
            p.RodarFase();
        }

        /* Inicio da fase mata mata */
        //p = new PartidaMataMata();
        
    }
    
}
