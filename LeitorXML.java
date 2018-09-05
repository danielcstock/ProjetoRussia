import java.io.*;
import javax.xml.parsers.*;
import org.w3c.dom.Document;

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
    public void lerArquivo(){
        try{
            File xml = new File(Arquivo);
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            //Document doc = db.parse(xml);

            //doc.getDocumentElement().normalize();
            //System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
        } catch (Exception e) {
            //throw e;
        }
    }
}