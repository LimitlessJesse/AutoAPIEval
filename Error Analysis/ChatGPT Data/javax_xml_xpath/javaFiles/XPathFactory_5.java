import javax.xml.xpath.XPathFactory;
import javax.xml.xpath.XPathVariableResolver;

public class XPathFactory_5 {
    public static void main(String[] args) {
        XPathFactory factory = XPathFactory.newInstance();
        XPathVariableResolver resolver = null; // You need to implement XPathVariableResolver
        factory.setXPathVariableResolver(resolver);
    }
}
