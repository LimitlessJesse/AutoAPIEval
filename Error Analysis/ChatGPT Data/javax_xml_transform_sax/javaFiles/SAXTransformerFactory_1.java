import javax.xml.transform.TransformerFactory;
import javax.xml.transform.sax.SAXTransformerFactory;
import javax.xml.transform.sax.TransformerHandler;

public class SAXTransformerFactory_1 {
    public static void main(String[] args) throws Exception {
        TransformerFactory factory = TransformerFactory.newInstance();
        if (factory.getFeature(SAXTransformerFactory.FEATURE)) {
            SAXTransformerFactory saxFactory = (SAXTransformerFactory) factory;
            TransformerHandler handler = saxFactory.newTransformerHandler();
            System.out.println("TransformerHandler created successfully.");
        } else {
            System.out.println("SAXTransformerFactory is not supported.");
        }
    }
}
