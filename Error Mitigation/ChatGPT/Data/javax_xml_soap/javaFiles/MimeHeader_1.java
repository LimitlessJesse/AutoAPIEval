import javax.xml.soap.MimeHeader;

public class MimeHeader_1 {
    public static void main(String[] args) {
        MimeHeader mimeHeader = new MimeHeader("Content-Type", "text/xml");
        String headerName = mimeHeader.getName();
        System.out.println("Header Name: " + headerName);
    }
}
