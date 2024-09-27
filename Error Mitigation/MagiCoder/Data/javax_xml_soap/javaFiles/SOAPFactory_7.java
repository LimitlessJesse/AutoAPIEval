import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPFactory;

public class SOAPFactory_7 {
    public static void main(String[] args) {
        try {
            SOAPFactory factory = SOAPFactory.newInstance();
            QName qname = new QName("http://www.w3.org/2003/05/soap-envelope", "Envelope");
            SOAPElement element = factory.createElement(qname);
            System.out.println(element);
        } catch (SOAPException e) {
            e.printStackTrace();
        }
    }
}
