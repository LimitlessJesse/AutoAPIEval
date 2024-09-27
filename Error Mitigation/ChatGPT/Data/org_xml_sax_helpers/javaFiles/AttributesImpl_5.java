import org.xml.sax.helpers.AttributesImpl;

public class AttributesImpl_5 {
    public static void main(String[] args) {
        AttributesImpl attributes = new AttributesImpl();
        attributes.addAttribute("", "localName1", "localName1", "CDATA", "value1");
        attributes.addAttribute("", "localName2", "localName2", "CDATA", "value2");

        // Set the local name of the attribute at index 1
        attributes.setLocalName(1, "newLocalName");

        // Display the updated attributes
        for (int i = 0; i < attributes.getLength(); i++) {
            System.out.println("Local Name at index " + i + ": " + attributes.getLocalName(i));
        }
    }
}
