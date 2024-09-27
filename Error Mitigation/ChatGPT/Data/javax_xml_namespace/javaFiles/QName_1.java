import javax.xml.namespace.QName;

public class QName_1 {
    public static void main(String[] args) {
        QName qName = new QName("http://www.example.com", "element");
        String localPart = qName.getLocalPart();
        System.out.println("Local Part: " + localPart);
    }
}
