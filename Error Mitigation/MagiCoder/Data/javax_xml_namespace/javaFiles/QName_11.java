import javax.xml.namespace.QName;

public class QName_11 {
    public static void main(String[] args) {
        String qNameAsString = "{http://www.example.com}element";
        QName qName = QName.valueOf(qNameAsString);
        System.out.println("Namespace URI: " + qName.getNamespaceURI());
        System.out.println("Local part: " + qName.getLocalPart());
    }
}
