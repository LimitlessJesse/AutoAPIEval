import javax.xml.soap.*;

public class MimeHeaders_5 {
    public static void main(String[] args) throws SOAPException {
        // Create a SOAP Connection
        SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
        SOAPConnection soapConnection = soapConnectionFactory.createConnection();

        // Send an SOAP Message to the SOAP Server
        String url = "http://localhost:8080/ws/hello";
        SOAPMessage requestMessage = MessageFactory.newInstance().createMessage();
        SOAPPart soapPart = requestMessage.getSOAPPart();

        // Create the SOAP Envelope
        SOAPEnvelope envelope = soapPart.getEnvelope();

        // Create the MimeHeaders
        MimeHeaders headers = envelope.getMimeHeaders();

        // Add the header
        headers.addHeader("HeaderName", "HeaderValue");

        // Create the SOAP Body
        SOAPBody soapBody = envelope.getBody();

        // Create the SOAP Request
        SOAPMessage soapResponse = soapConnection.call(createSOAPRequest(soapBody), url);

        // Remove the header
        headers.removeHeader("HeaderName");

        // Print the SOAP Response
        System.out.println("Response SOAP Message:");
        soapResponse.writeTo(System.out);

        soapConnection.close();
    }

    private static SOAPMessage createSOAPRequest(SOAPBody soapBody) throws SOAPException {
        // Create the SOAP Request
        MessageFactory messageFactory = MessageFactory.newInstance();
        SOAPMessage soapMessage = messageFactory.createMessage();

        // Create the SOAP Body
        // Add the body content here

        return soapMessage;
    }
}
