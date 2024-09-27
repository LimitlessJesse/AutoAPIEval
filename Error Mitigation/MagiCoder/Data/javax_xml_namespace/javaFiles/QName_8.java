import javax.xml.namespace.QName;

public class QName_8 {
    public static void main(String[] args) {
        QName qname1 = new QName("http://www.example.com", "example");
        QName qname2 = new QName("http://www.example.com", "example");
        QName qname3 = new QName("http://www.example.com", "another");

        System.out.println(qname1.equals(qname2));  // true
        System.out.println(qname1.equals(qname3));  // false
    }
}
