import javax.management.Attribute;
import javax.management.AttributeList;

public class AttributeList_3 {
    public static void main(String[] args) {
        Attribute attr = new Attribute("name", "John");
        AttributeList attrList = new AttributeList();
        attrList.add(attr);
        System.out.println(attrList);
    }
}
