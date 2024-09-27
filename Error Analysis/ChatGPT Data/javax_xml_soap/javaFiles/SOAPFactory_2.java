import javax.xml.soap.*;

public class SOAPFactory_2 {
    public static void main(String[] args) {
        try {
            SOAPFactory factory = SOAPFactory.newInstance();
            SOAPElement element = factory.createElement("exampleElement");
            System.out.println("Created element: " + element.getNodeName());
        } catch (SOAPException e) {
            System.out.println("Error creating SOAP element: " + e.getMessage());
        }
    }
}
