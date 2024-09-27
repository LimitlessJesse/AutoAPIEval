import javax.xml.namespace.QName;

public class QName_5 {
    public static void main(String[] args) {
        QName qName = new QName("http://example.com", "localPart", "prefix");
        int hashCode = qName.hashCode();
        System.out.println("Hash code for QName: " + hashCode);
    }
}
