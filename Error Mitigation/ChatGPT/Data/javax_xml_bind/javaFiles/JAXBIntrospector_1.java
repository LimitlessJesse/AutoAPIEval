import javax.xml.bind.JAXBIntrospector;
import javax.xml.bind.JAXBElement;

public class JAXBIntrospector_1 {
    public static void main(String[] args) {
        JAXBElement<String> jaxbElement = new JAXBElement<>(null, String.class, "Hello");
        Object value = JAXBIntrospector.getValue(jaxbElement);
        System.out.println(value);
    }
}
