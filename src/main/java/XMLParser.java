import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public abstract class XMLParser {
    protected Document document;
    public void loadXML(String pathName){
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            this.document = (Document) documentBuilder.parse(pathName);
            ((org.w3c.dom.Document) this.document).getDocumentElement().normalize();
        } catch (Exception e){ //Asszem azért kell csak "e"-t oda írni, mert így talán az összeset elkapja
            e.printStackTrace();
        }
    }
}
