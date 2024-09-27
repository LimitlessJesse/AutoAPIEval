import javax.xml.namespace.QName;

public class QName_3 {
    public static void main(String[] args) {
        QName qName = new QName("http://www.example.com/namespace", "exampleElement");
        String prefix = qName.getPrefix();
        System.out.println("Prefix: " + prefix);
    }
}
