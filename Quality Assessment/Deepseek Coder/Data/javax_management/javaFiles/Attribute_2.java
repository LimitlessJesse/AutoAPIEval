import javax.management.Attribute;
import javax.management.AttributeList;
import javax.management.AttributeNotFoundException;
import javax.management.MBeanException;
import javax.management.ReflectionException;

public class Attribute_2 {
    public static void main(String[] args) {
        try {
            AttributeList attrList = new AttributeList();
            attrList.add(new Attribute("Name", "John Doe"));
            attrList.add(new Attribute("Age", 30));

            Attribute attr = attrList.get("Name");
            String name = (String) attr.getValue();
            System.out.println("Name: " + name);

            attr = attrList.get("Age");
            int age = (int) attr.getValue();
            System.out.println("Age: " + age);
        } catch (AttributeNotFoundException | MBeanException | ReflectionException e) {
            e.printStackTrace();
        }
    }
}
