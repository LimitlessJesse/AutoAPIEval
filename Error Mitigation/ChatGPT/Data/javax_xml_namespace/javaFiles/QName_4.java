import javax.xml.namespace.QName;

public class QName_4 {
    public static void main(String[] args) {
        QName qName1 = new QName("http://example.com", "element");
        QName qName2 = new QName("http://example.com", "element");

        boolean result = qName1.equals(qName2);
        System.out.println("Are qName1 and qName2 equal? " + result);
    }
}
