import javax.xml.soap.*;

public class MimeHeaders_4 {
    public static void main(String[] args) {
        try {
            // Create a SOAP Connection
            SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
            SOAPConnection soapConnection = soapConnectionFactory.createConnection();

            // Send an SOAP Message to the SOAP Server
            String url = "http://localhost:8080/ws/hello";
            SOAPMessage request = MessageFactory.newInstance().createMessage();
            SOAPPart soapPart = request.getSOAPPart();

            // Create the SOAP Envelope
            SOAPEnvelope envelope = soapPart.getEnvelope();

            // Create the MimeHeaders
            MimeHeaders headers = envelope.getMimeHeaders();

            // Set the header
            headers.setHeader("name", "value");

            // Create the SOAP Body
            SOAPBody soapBody = envelope.getBody();

            // Create the SOAP Fault
            SOAPFault soapFault = soapBody.getFault();

            // Create the SOAP Message
            SOAPMessage response = soapConnection.call(request, url);

            // Print the SOAP Response
            System.out.println("Response SOAP Message: " + response);

            soapConnection.close();
        } catch (Exception e) {
            System.err.println("\nError occurred while sending SOAP Request to Server!\nMake sure you have the correct endpoint URL and SOAPRequest XML is properly formatted: " + e);
        }
    }
}
