import javax.xml.soap.MimeHeaders;
import javax.xml.soap.MimeHeader;
import java.util.Iterator;

public class MimeHeaders_3 {
    public static void main(String[] args) {
        MimeHeaders headers = new MimeHeaders();
        headers.addHeader("Content-Type", "text/xml");
        headers.addHeader("SOAPAction", "http://www.example.com/Action");

        Iterator<MimeHeader> iterator = headers.getAllHeaders();
        while(iterator.hasNext()) {
            MimeHeader header = iterator.next();
            System.out.println("Header Name: " + header.getName() + ", Header Value: " + header.getValue());
        }
    }
}
