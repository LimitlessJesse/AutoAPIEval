import javax.xml.bind.JAXBElement;

public class JAXBElement_3 {
    public static void main(String[] args) {
        JAXBElement<String> element = new JAXBElement<String>(null, String.class, "Value");
        System.out.println(element.isNil()); // Output: false
    }
}
