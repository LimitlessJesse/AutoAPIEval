import javax.management.Attribute;
import javax.management.AttributeList;
import javax.management.AttributeNotFoundException;
import javax.management.InvalidAttributeValueException;
import javax.management.MBeanException;
import javax.management.ModelMBean;
import javax.management.modelmbean.RequiredModelMBean;

public class RequiredModelMBean_4 {
    public static void main(String[] args) {
        // Create a RequiredModelMBean
        ModelMBean mbean = new RequiredModelMBean();

        // Create an Attribute
        Attribute attribute = new Attribute("AttributeName", "AttributeValue");

        // Set the Attribute
        try {
            mbean.setAttribute(attribute);
        } catch (AttributeNotFoundException | InvalidAttributeValueException | MBeanException e) {
            e.printStackTrace();
        }
    }
}
