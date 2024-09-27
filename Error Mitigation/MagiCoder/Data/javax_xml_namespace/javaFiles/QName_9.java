import javax.xml.namespace.QName;

public class QName_9 {
    public static void main(String[] args) {
        QName qname = new QName("http://www.example.com", "example", "ex");
        System.out.println(qname.hashCode());
    }
}
