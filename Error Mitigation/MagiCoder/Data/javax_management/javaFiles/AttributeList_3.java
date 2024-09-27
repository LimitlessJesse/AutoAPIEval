import javax.management.AttributeList;
import javax.management.Attribute;
import javax.management.MBeanAttributeInfo;
import javax.management.MBeanException;
import javax.management.ReflectionException;
import java.util.ArrayList;

public class AttributeList_3 {
    public static void main(String[] args) throws MBeanException, ReflectionException {
        // Create an AttributeList
        AttributeList attributeList = new AttributeList();
        attributeList.add(new Attribute("name", "John"));
        attributeList.add(new Attribute("age", 30));

        // Create another AttributeList
        AttributeList anotherAttributeList = new AttributeList();
        anotherAttributeList.add(new Attribute("city", "New York"));
        anotherAttributeList.add(new Attribute("country", "USA"));

        // Add all attributes from anotherAttributeList to attributeList
        attributeList.addAll(anotherAttributeList);

        // Print the attributes in attributeList
        for (Attribute attribute : attributeList) {
            System.out.println(attribute.getName() + ": " + attribute.getValue());
        }
    }
}
