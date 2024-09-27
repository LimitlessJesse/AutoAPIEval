import javax.xml.xpath.XPathFactory;
import javax.xml.xpath.XPathFunctionResolver;

public class XPathFactory_4 {
    public static void main(String[] args) {
        XPathFactory xPathFactory = XPathFactory.newInstance();
        XPathFunctionResolver resolver = // your custom implementation of XPathFunctionResolver
        xPathFactory.setXPathFunctionResolver(resolver);
    }
}
