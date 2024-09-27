import javax.xml.namespace.QName;

public class QName_4 {
    public static void main(String[] args) {
        QName qname1 = new QName("http://example.com", "test");
        QName qname2 = new QName("http://example.com", "test");

        boolean isEqual = qname1.equals(qname2);
        System.out.println("Are the QNames equal? " + isEqual);
    }
}
