import javax.xml.soap.MimeHeader;

public class MimeHeader_2 {
    public static void main(String[] args) {
        MimeHeader mimeHeader = new MimeHeader("Content-Type", "text/xml");
        String value = mimeHeader.getValue();
        System.out.println("Header value: " + value);
    }
}
