import javax.xml.soap.MimeHeaders;

public class MimeHeaders_5 {
    public static void main(String[] args) {
        MimeHeaders headers = new MimeHeaders();
        headers.addHeader("Content-Type", "text/xml");
        headers.addHeader("SOAPAction", "http://www.example.org/Action");
        
        System.out.println("Headers before removal: " + headers.toString());
        
        headers.removeAllHeaders();
        
        System.out.println("Headers after removal: " + headers.toString());
    }
}
