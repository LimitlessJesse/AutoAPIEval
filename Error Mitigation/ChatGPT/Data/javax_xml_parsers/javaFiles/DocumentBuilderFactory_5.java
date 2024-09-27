import javax.xml.parsers.DocumentBuilderFactory;

public class DocumentBuilderFactory_5 {
    public static void main(String[] args) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setExpandEntityReferences(true);
    }
}
