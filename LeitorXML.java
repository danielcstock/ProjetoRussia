import java.io.*;
import javax.xml.parsers.*;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import java.util.LinkedList;

public class LeitorXML {
    private String Arquivo;
    private String[] ElementosPai;
    private String[] AtributosPai;
    private String[] ElementosFilho;
    private String[] AtributosFilho;

    /* Metodos do builder  */
    public LeitorXML setArquivo(String arquivo){
        try{
            this.Arquivo = arquivo;
        } catch (Exception e){

        }
        return this;
    }

    public LeitorXML setElementosPai(String[] elementosPai){
        try{
            this.ElementosPai = elementosPai;
        } catch(Exception e){
            
        }
        return this;
    }

    public LeitorXML setElementosFilho(String[] elementosFilho){
        try {
            this.ElementosFilho = elementosFilho;
        } catch (Exception e){

        }
        return this;
    }

    public LeitorXML setAtributosPai(String[] atributosPai){
        try {
            this.AtributosPai = atributosPai;
        } catch (Exception e){

        }
        return this;
    }

    public LeitorXML setAtributosFilho(String[] atributosFilho){
        try {
            this.AtributosFilho = atributosFilho;
        } catch (Exception e) {

        }
        return this;
    }

    public String getArquivo(){
        return this.Arquivo;
    }

    /*  Metodos de execucao */
    public void lerArquivo(LinkedList lista){
        try{
            File xml = new File(Arquivo);
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            dbf.setNamespaceAware(false);
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(xml);

            doc.getDocumentElement().normalize();
            NodeList NodeLista = doc.getElementsByTagName("Time");
            for(int i = 0; i < NodeLista.getLength(); i++){
                Node item = NodeLista.item(i);
                Element elemento = (Element) item;
                NodeList jogadores = item.getChildNodes();
                LinkedList<Esportista> listaJogadores = new LinkedList<Esportista>();
                //System.out.println(jogadores.getTextContent());
                for(int j = 0; j < jogadores.getLength(); j++){
                    Element jogador = (Element)elemento.getElementsByTagName("Jogador").item(j);
                    Element nomeJogador = (Element)jogador.getElementsByTagName("Nome").item(0);
                    Element probGolsJogador = (Element)jogador.getElementsByTagName("ProbabilidadeGols").item(0);
                    Element probCartaoJogador = (Element)jogador.getElementsByTagName("ProbabilidadeCartao").item(0);
                    Jogador p = new Jogador();
                    p = p.setNome(nomeJogador.getTextContent())
                         .setProbabilidadeGols(Double.parseDouble(probGolsJogador.getTextContent()))
                         .setProbabilidadeCartao(Double.parseDouble(probCartaoJogador.getTextContent()));
                    listaJogadores.add(p);
                }
                /*Time t = new Time();
                t = t.setNome(elemento.getElementsByTagName("Nome").item(0).getTextContent())
                     .setJogadores(listaJogadores);*/
            }
            //return lista;
        } catch (Exception e) {
            //throw e;
            //return null;
        }
    }
}