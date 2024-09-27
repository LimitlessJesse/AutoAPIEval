import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;

public class SOAPMessage_5 {
    public static void main(String[] args) {
        // Create a SOAPMessage
        SOAPMessage soapMessage = null;
        try {
            soapMessage = javax.xml.soap.MessageFactory.newInstance().createMessage();
        } catch (SOAPException e) {
            e.printStackTrace();
        }
        
        // Save changes to the SOAPMessage
        try {
            soapMessage.saveChanges();
            System.out.println("Changes saved successfully.");
        } catch (SOAPException e) {
            e.printStackTrace();
        }
    }
}
