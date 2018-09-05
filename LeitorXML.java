import org.xml.sax.helpers.DefaultHandler;

public class LeitorXML extends DefaultHandler{
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
        return this;
    }

    public LeitorXML setAtributosPai(String[] atributosPai){
        return this;
    }

    public LeitorXML setAtributosFilho(String[] atributosFilho){
        return this;
    }

    /*@Override
    public void lerArquivo() throws SAXException{

    }*/

    public void inicioElemento(){

    }
}