import javax.management.openmbean.OpenMBeanAttributeInfoSupport;

public class OpenMBeanAttributeInfoSupport_4 {
    public static void main(String[] args) {
        OpenMBeanAttributeInfoSupport attributeInfo = new OpenMBeanAttributeInfoSupport("attributeName", "attributeType", "attributeDescription", true, false, false);
        Object defaultValue = attributeInfo.getDefaultValue();
        System.out.println("Default Value: " + defaultValue);
    }
}
