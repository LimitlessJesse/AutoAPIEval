import javax.xml.soap.*;

public class MessageFactory_2 {
    public static void main(String[] args) {
        try {
            MessageFactory factory = MessageFactory.newInstance();
            MimeHeaders headers = new MimeHeaders();
            InputStream inputStream = new ByteArrayInputStream("Sample SOAP message".getBytes());
            
            SOAPMessage message = factory.createMessage(headers, inputStream);
            
            System.out.println("SOAP message created successfully");
        } catch (Exception e) {
            System.out.println("Error creating SOAP message: " + e.getMessage());
        }
    }
}
