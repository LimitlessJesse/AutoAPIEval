import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class DocumentBuilderFactory_4 {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setXIncludeAware(true);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
    }
}
