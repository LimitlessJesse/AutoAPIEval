import javax.swing.text.html.parser.AttributeList;

public class AttributeList_3 {
    public static void main(String[] args) {
        AttributeList attributeList = new AttributeList();
        
        // Add some attributes to the list
        attributeList.add("id", "123");
        attributeList.add("name", "John");
        
        // Get the value of the "name" attribute
        String value = attributeList.getValue("name");
        System.out.println("Value of 'name' attribute: " + value);
    }
}
