import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class DocumentBuilder_4 {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            boolean isXIncludeAware = builder.isXIncludeAware();
            System.out.println("Is XInclude Aware: " + isXIncludeAware);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
    }
}
