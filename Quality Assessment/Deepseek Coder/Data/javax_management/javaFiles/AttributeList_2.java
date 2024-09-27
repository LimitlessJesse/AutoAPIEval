import javax.management.Attribute;
import javax.management.AttributeList;

public class AttributeList_2 {
    public static void main(String[] args) {
        AttributeList list = new AttributeList();
        Attribute attribute = new Attribute("name", "value");
        list.add(0, attribute);
        System.out.println(list);
    }
}
