import javax.xml.bind.JAXBIntrospector;
import javax.xml.bind.JAXBElement;

public class JAXBIntrospector_3 {
    public static void main(String[] args) {
        JAXBIntrospector introspector = JAXBIntrospector.getInstance();
        
        // Create a JAXB element
        JAXBElement<String> element = new JAXBElement<>(null, String.class, "Hello");
        
        // Check if the object is a JAXB element
        boolean isElement = introspector.isElement(element);
        
        System.out.println("Is element: " + isElement);
    }
}
