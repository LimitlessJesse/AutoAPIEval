import javax.xml.namespace.QName;

public class QName_4 {
    public static void main(String[] args) {
        QName qName = new QName("http://www.example.com", "localPart", "namespace");
        String localPart = qName.getLocalPart();
        System.out.println("Local part: " + localPart);
    }
}
