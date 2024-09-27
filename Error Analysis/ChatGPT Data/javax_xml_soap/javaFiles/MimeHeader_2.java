import javax.xml.soap.MimeHeader;

public class MimeHeader_2 {
    public static void main(String[] args) {
        MimeHeader header = new MimeHeader("Content-Type", "text/html");
        String name = header.getName();
        System.out.println("Header name: " + name);
    }
}
