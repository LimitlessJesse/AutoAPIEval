import javax.xml.soap.*;

public class SOAPConnection_3 {
    public static void main(String[] args) {
        try {
            SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
            SOAPConnection soapConnection = soapConnectionFactory.createConnection();

            String endpointUrl = "http://example.com/soapEndpoint";
            SOAPMessage soapResponse = soapConnection.get(endpointUrl);

            soapConnection.close();

            // Process the SOAP response
            System.out.println("SOAP Response:");
            soapResponse.writeTo(System.out);

        } catch (Exception e) {
            System.err.println("Error occurred while sending SOAP Request to Server");
            e.printStackTrace();
        }
    }
}
