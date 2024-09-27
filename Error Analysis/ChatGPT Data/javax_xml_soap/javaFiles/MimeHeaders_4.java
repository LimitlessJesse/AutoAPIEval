import javax.xml.soap.MimeHeaders;
import javax.xml.soap.SOAPMessage;

public class MimeHeaders_4 {
    public static void main(String[] args) {
        try {
            // Create a SOAP message
            SOAPMessage message = null; // Initialize SOAP message here

            // Set a header using setHeader method
            MimeHeaders headers = message.getMimeHeaders();
            headers.setHeader("Content-Type", "text/xml");

            // Get all headers and print them
            String[] headerNames = headers.getAllHeaders();
            for (String headerName : headerNames) {
                String[] headerValues = headers.getHeader(headerName);
                for (String headerValue : headerValues) {
                    System.out.println(headerName + ": " + headerValue);
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
