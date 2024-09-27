import javax.xml.namespace.QName;

public class QName_2 {
    public static void main(String[] args) {
        QName qName = new QName("http://www.example.com/namespace", "exampleElement");
        String namespaceURI = qName.getNamespaceURI();
        System.out.println("Namespace URI: " + namespaceURI);
    }
}
