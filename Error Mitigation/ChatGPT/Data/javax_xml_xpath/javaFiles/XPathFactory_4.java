import javax.xml.xpath.XPathFactory;
import javax.xml.xpath.XPathFactoryConfigurationException;

public class XPathFactory_4 {
    public static void main(String[] args) {
        try {
            XPathFactory factory = XPathFactory.newInstance("http://java.sun.com/jaxp/xpath/dom");
            System.out.println("XPathFactory instance created successfully");
        } catch (XPathFactoryConfigurationException e) {
            System.out.println("Error creating XPathFactory instance: " + e.getMessage());
        }
    }
}
