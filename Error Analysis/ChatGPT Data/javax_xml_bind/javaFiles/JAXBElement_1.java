import javax.xml.bind.JAXBElement;

public class JAXBElement_1 {
    public static void main(String[] args) {
        JAXBElement<String> element = new JAXBElement<>("foo", String.class, "bar");
        System.out.println("QName name: " + element.getName());
    }
}
