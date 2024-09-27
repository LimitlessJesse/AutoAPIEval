import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class JAXBElement_10 {
    public static void main(String[] args) {
        QName qName = new QName("http://www.example.com/namespace", "elementName");
        JAXBElement<String> jaxbElement = new JAXBElement<>(qName, String.class, "Hello");
        QName name = jaxbElement.getName();
        System.out.println(name);
    }
}
