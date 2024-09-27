import javax.management.openmbean.OpenType;
import javax.management.openmbean.OpenMBeanAttributeInfoSupport;

public class OpenMBeanAttributeInfoSupport_3 {
    public static void main(String[] args) {
        OpenMBeanAttributeInfoSupport attributeInfo = new OpenMBeanAttributeInfoSupport("attributeName", "attributeDescription", OpenType.STRING);
        OpenType<?> openType = attributeInfo.getOpenType();
        System.out.println("Open Type: " + openType);
    }
}
