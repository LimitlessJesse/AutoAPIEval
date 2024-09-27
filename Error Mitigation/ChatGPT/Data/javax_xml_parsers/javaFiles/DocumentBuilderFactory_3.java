import javax.xml.parsers.DocumentBuilderFactory;

public class DocumentBuilderFactory_3 {
    public static void main(String[] args) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setValidating(true);
    }
}
