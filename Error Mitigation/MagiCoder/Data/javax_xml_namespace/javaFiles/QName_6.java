import javax.xml.namespace.QName;

public class QName_6 {
    public static void main(String[] args) {
        QName qName = new QName("http://www.example.com/schema", "elementName", "prefix");
        String prefix = qName.getPrefix();
        System.out.println("Prefix: " + prefix);
    }
}
