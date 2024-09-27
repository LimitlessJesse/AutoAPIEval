import javax.xml.namespace.QName;

public class QName_1 {
    public static void main(String[] args) {
        QName qName = new QName("http://example.com", "localPart", "prefix");
        String localPart = qName.getLocalPart();
        System.out.println("Local Part: " + localPart);
    }
}
