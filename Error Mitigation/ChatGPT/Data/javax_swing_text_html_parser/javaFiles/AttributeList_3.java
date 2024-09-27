import javax.swing.text.html.parser.AttributeList;

public class AttributeList_3 {
    public static void main(String[] args) {
        AttributeList attributeList = new AttributeList();
        AttributeList nextAttribute = attributeList.getNext();
        System.out.println(nextAttribute);
    }
}
