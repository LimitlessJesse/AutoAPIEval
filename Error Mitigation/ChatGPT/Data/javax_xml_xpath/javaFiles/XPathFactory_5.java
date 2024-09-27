import javax.xml.xpath.XPathFactory;
import javax.xml.xpath.XPathFactoryConfigurationException;

public class XPathFactory_5 {
    public static void main(String[] args) {
        try {
            XPathFactory factory = XPathFactory.newInstance("http://java.sun.com/jaxp/xpath/dom", "com.example.CustomXPathFactory", XPathFactory_5.class.getClassLoader());
            System.out.println("XPathFactory instance created successfully");
        } catch (XPathFactoryConfigurationException e) {
            System.err.println("Error creating XPathFactory instance: " + e.getMessage());
        }
    }
}
