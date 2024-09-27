import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;
import javax.xml.xpath.XPathConstants;

public class XPathFactory_2 {
    public static void main(String[] args) throws Exception {
        XPathFactory xPathFactory = XPathFactory.newInstance();
        XPath xPath = xPathFactory.newXPath();
        String expression = "/bookstore/book[1]/title/text()";
        String xml = "<bookstore><book><title>Harry Potter</title></book></bookstore>";
        System.out.println(xPath.evaluate(expression, xml, XPathConstants.STRING));
    }
}
