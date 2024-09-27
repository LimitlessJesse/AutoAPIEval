import javax.xml.soap.*;

public class MessageFactory_1 {
    public static void main(String[] args) {
        try {
            // Create a SOAP Connection
            SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
            SOAPConnection soapConnection = soapConnectionFactory.createConnection();

            // Send an SOAP Message to a SOAP Endpoint
            String url = "http://www.dneonline.com/calculator.asmx";
            SOAPMessage soapResponse = soapConnection.call(createSOAPRequest(), url);

            // Print the SOAP Response
            System.out.println("Response SOAP Message:");
            soapResponse.writeTo(System.out);

            soapConnection.close();
        } catch (Exception e) {
            System.err.println("\nError occurred while sending SOAP Request to Server!\nMake sure you have the correct endpoint URL and SOAPRequest!\n");
            e.printStackTrace();
        }
    }

    private static SOAPMessage createSOAPRequest() throws Exception {
        MessageFactory messageFactory = MessageFactory.newInstance();
        SOAPMessage soapMessage = messageFactory.createMessage();

        // SOAP Envelope
        SOAPPart soapPart = soapMessage.getSOAPPart();

        // SOAP Body
        SOAPBody soapBody = soapBody = soapPart.getEnvelope().getBody();

        // Create SOAP Body
        SOAPElement soapBodyElem = soapBody.addChildElement("Add", "http://tempuri.org/", "http://www.dneonline.com/calculator.asmx");
        SOAPElement soapBodyElem1 = soapBodyElem.addChildElement("intA");
        soapBodyElem1.addTextNode("5");
        SOAPElement soapBodyElem2 = soapBodyElem.addChildElement("intB");
        soapBodyElem2.addTextNode("5");

        // Create SOAP Header
        SOAPHeader sh = soapPart.getEnvelope().getHeader();
        SOAPElement smelem = sh.addChildElement("Header", "http://www.w3.org/2003/05/soap-envelope/", "http://www.w3.org/2003/05/soap-envelope/");
        smelem.addAttribute(new QName("http://www.w3.org/2003/05/soap-envelope/", "mustUnderstand", "1"), "1");

        MimeHeaders headers = soapMessage.getMimeHeaders();
        headers.addHeader("SOAPAction", "http://tempuri.org/Add");

        soapMessage.saveChanges();

        return soapMessage;
    }
}
