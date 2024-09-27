import javax.xml.soap.*;

public class MimeHeaders_1 {
    public static void main(String[] args) {
        try {
            // Create a SOAP Connection
            SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
            SOAPConnection soapConnection = soapConnectionFactory.createConnection();

            // Send an SOAP Message to the SOAP Server
            String url = "http://localhost:8080/ws/hello";
            SOAPMessage request = MessageFactory.newInstance().createMessage();
            SOAPPart soapPart = request.getSOAPPart();

            // Create the MimeHeaders
            MimeHeaders headers = soapPart.getMimeHeaders();

            // Add the header
            headers.addHeader("User-Agent", "Java-SOAP-Connector");

            // Create the message
            SOAPMessage response = soapConnection.call(createSOAPRequest(soapPart), url);

            // Print the SOAP Response
            System.out.println("Response SOAP Message:");
            response.writeTo(System.out);

            soapConnection.close();
        } catch (Exception e) {
            System.err.println("\nError occurred while sending SOAP Request to Server!\nMake sure you have the correct endpoint URL and SOAPRequest!\n");
            e.printStackTrace();
        }
    }

    private static SOAPMessage createSOAPRequest(SOAPPart soapPart) throws Exception {
        // Create the SOAP Body
        SOAPBody soapBody = soapPart.getEnvelope().getBody();

        // Create the SOAP Body
        SOAPElement soapBodyElem = soapBody.addChildElement("sayHello", "ns1", "http://www.example.org/sayHello");
        SOAPElement soapBodyElem1 = soapBodyElem.addChildElement("name");
        soapBodyElem1.addTextNode("Test");

        // Create the SOAP Header
        SOAPHeader sh = soapPart.getEnvelope().getHeader();
        SOAPElement to = sh.addChildElement("To", "http://www.w3.org/2005/08/addressing");
        to.addTextNode("http://www.example.org/sayHello");

        // Create the SOAP Envelope
        SOAPEnvelope envelope = soapPart.getEnvelope();

        // Create the SOAP Message
        SOAPMessage soapMessage = soapPart.getMimeHeaders().getContentType().createInstance();

        // Set the SOAP Message
        soapMessage.setSOAPPart(soapPart);

        return soapMessage;
    }
}
