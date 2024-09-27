import javax.xml.soap.MimeHeader;
import javax.xml.soap.MimeHeaders;
import java.util.Iterator;

public class MimeHeaders_3 {
    public static void main(String[] args) {
        MimeHeaders mimeHeaders = new MimeHeaders();
        mimeHeaders.addHeader("Content-Type", "text/xml");
        mimeHeaders.addHeader("SOAPAction", "http://www.example.com/Action");

        Iterator<MimeHeader> iterator = mimeHeaders.getAllHeaders();
        while (iterator.hasNext()) {
            MimeHeader header = iterator.next();
            System.out.println(header.getName() + ": " + header.getValue());
        }
    }
}
