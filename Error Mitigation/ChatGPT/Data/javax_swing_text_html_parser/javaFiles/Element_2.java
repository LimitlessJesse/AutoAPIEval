import javax.swing.text.html.parser.AttributeList;

public class Element_2 {
    public static void main(String[] args) {
        // Create an instance of Element
        Element element = new Element();
        
        // Get the attributes using getAttributes() method
        AttributeList attributes = element.getAttributes();
        
        // Use the attributes as needed
        // For example, iterate through the attributes
        for (int i = 0; i < attributes.getLength(); i++) {
            System.out.println("Attribute name: " + attributes.getName(i));
            System.out.println("Attribute value: " + attributes.getValue(i));
        }
    }
}
