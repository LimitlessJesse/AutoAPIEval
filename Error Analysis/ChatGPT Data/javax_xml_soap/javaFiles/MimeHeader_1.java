import javax.xml.soap.MimeHeader;
import javax.xml.soap.Name;
import javax.xml.soap.SOAPException;

public class MimeHeader_1 {
    public static void main(String[] args) throws SOAPException {
        MimeHeader header = new MimeHeader("Content-Type", "application/xml");
        System.out.println(header.getName()); // Output: Content-Type
        System.out.println(header.getValue()); // Output: application/xml
    }
}
