import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class SOAPPart_2 {
    public static void main(String[] args) {
        try {
            MessageFactory messageFactory = MessageFactory.newInstance();
            SOAPMessage soapMessage = messageFactory.createMessage();
            SOAPPart soapPart = soapMessage.getSOAPPart();

            String xmlContent = "<xml><data>Hello World</data></xml>";
            Source source = new StreamSource(new ByteArrayInputStream(xmlContent.getBytes()));
            
            soapPart.setContent(source);

            soapMessage.saveChanges();
            
            soapMessage.writeTo(System.out);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
