import javax.swing.text.html.parser.AttributeList;

public class AttributeList_1 {
    public static void main(String[] args) {
        AttributeList attributeList = new AttributeList();
        // Add some attributes to the attribute list
        attributeList.add("name1", "value1");
        attributeList.add("name2", "value2");

        // Getting the first attribute from the attribute list
        AttributeList nextAttribute = attributeList.getNext();

        // Printing the name and value of the next attribute
        System.out.println("Next attribute - Name: " + nextAttribute.getName() + ", Value: " + nextAttribute.getValue());
    }
}
