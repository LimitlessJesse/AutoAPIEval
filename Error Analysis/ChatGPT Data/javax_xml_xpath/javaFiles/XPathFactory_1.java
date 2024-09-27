import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;

public class XPathFactory_1 {
    public static void main(String[] args) {
        XPathFactory factory = XPathFactory.newInstance();
        XPath xpath = factory.newXPath();
        
        // Now you can use the xpath object to evaluate XPath expressions
    }
}
