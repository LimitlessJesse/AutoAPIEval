import javax.management.Attribute;
import javax.management.StandardMBean;

public class StandardMBean_1 {
    public static void main(String[] args) {
        StandardMBean mbean = new StandardMBean(new YourMBeanImplementation(), YourMBeanInterface.class);
        Attribute attribute = new Attribute("attributeName", "attributeValue");
        mbean.setAttribute(attribute);
    }
}
