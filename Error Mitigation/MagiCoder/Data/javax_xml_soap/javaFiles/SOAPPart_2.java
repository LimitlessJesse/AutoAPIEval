import javax.xml.soap.*;

public class SOAPPart_2 {
    public static void main(String[] args) throws SOAPException {
        SOAPFactory factory = SOAPFactory.newInstance();
        SOAPMessage message = factory.createMessage();
        SOAPPart part = message.getSOAPPart();
        SOAPEnvelope envelope = part.getEnvelope();
        System.out.println(envelope);
    }
}
