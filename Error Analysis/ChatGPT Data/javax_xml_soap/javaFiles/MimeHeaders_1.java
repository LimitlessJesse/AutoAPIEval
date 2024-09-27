import javax.xml.soap.MimeHeaders;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPException;

public class MimeHeaders_1 {
    public static void addHeader(SOAPMessage message, String name, String value) throws SOAPException {
        MimeHeaders headers = message.getMimeHeaders();
        headers.addHeader(name, value);
    }

    public static void main(String[] args) {
        try {
            MessageFactory factory = MessageFactory.newInstance();
            SOAPMessage message = factory.createMessage();
            
            // Adding a header to the SOAPMessage
            addHeader(message, "CustomHeader", "CustomValue");
            
            // Print the headers
            MimeHeaders headers = message.getMimeHeaders();
            String[] headerNames = headers.getHeader("CustomHeader");
            for (String header : headerNames) {
                System.out.println("Header Name: CustomHeader, Value: " + header);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
