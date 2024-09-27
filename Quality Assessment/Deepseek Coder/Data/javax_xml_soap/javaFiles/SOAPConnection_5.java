import javax.xml.soap.*;

public class SOAPConnection_5 {
    public static void main(String[] args) {
        try {
            // Create SOAP Connection
            SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
            SOAPConnection soapConnection = soapConnectionFactory.createConnection();

            // Send SOAP Message to SOAP Server
            String url = "http://localhost:8080/ws/hello";
            SOAPMessage request = MessageFactory.newInstance().createMessage();
            SOAPMessage response = soapConnection.call(request, url);

            // Print the SOAP Response
            System.out.println("Response SOAP Message:");
            System.out.println(response.getSOAPPart().getContent());

            // Close the connection
            soapConnection.close();

        } catch (Exception e) {
            System.err.println("\nError occurred while sending SOAP Request to Server!\nMake sure you have the correct endpoint URL and SOAPRequest XML is properly formatted!");
            e.printStackTrace();
        }
    }
}
