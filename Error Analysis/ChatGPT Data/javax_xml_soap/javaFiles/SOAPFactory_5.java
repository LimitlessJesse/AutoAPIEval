import javax.xml.soap.SOAPFactory;
import javax.xml.soap.SOAPFault;
import javax.xml.namespace.QName;

public class SOAPFactory_5 {
    public static void main(String[] args) {
        try {
            SOAPFactory soapFactory = SOAPFactory.newInstance();
            SOAPFault soapFault = soapFactory.createFault("Reason for the fault", new QName("http://example.com", "FaultCode"));
            System.out.println("SOAP Fault created: " + soapFault.toString());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
