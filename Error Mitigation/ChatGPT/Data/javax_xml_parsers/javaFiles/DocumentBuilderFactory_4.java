import javax.xml.parsers.DocumentBuilderFactory;

public class DocumentBuilderFactory_4 {
    public static void main(String[] args) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setIgnoringElementContentWhitespace(true);
    }
}
