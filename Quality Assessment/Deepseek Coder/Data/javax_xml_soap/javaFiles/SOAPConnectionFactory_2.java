import javax.xml.soap.*;

public class SOAPConnectionFactory_2 {
    public static void main(String[] args) {
        try {
            // Create SOAP Connection
            SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
            SOAPConnection soapConnection = soapConnectionFactory.createConnection();

            // Send SOAP Message to SOAP Server
            String url = "http://www.dneonline.com/calculator.asmx";
            SOAPMessage request = MessageFactory.newInstance().createMessage();
            SOAPPart soapPart = request.getSOAPPart();

            // SOAP Envelope
            SOAPEnvelope envelope = soapPart.getEnvelope();

            // SOAP Body
            SOAPBody soapBody = envelope.getBody();

            // SOAP Body - Add SOAP Elements
            SOAPElement soapBodyElem = soapBody.addChildElement("Add");
            SOAPElement soapBodyElem1 = soapBodyElem.addChildElement("intA");
            soapBodyElem1.addTextNode("5");
            SOAPElement soapBodyElem2 = soapBodyElem.addChildElement("intB");
            soapBodyElem2.addTextNode("5");

            // Send SOAP Message to SOAP Server
            SOAPMessage response = soapConnection.call(request, url);

            // Print the SOAP Response
            System.out.println("Response SOAP Message:");
            response.writeTo(System.out);

            soapConnection.close();
        } catch (Exception e) {
            System.err.println("\nError occurred while sending SOAP Request to Server!\nMake sure you have the correct endpoint URL and SOAPRequest XML is properly formatted!\n");
            e.printStackTrace();
        }
    }
}
