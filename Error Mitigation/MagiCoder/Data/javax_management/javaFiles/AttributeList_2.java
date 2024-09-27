import javax.management.Attribute;
import javax.management.AttributeList;
import javax.management.MBeanException;
import javax.management.ReflectionException;

public class AttributeList_2 {
    public static void main(String[] args) {
        AttributeList attributeList = new AttributeList();
        Attribute attribute = new Attribute("name", "value");
        try {
            attributeList.add(0, attribute);
        } catch (MBeanException | ReflectionException e) {
            e.printStackTrace();
        }
    }
}
