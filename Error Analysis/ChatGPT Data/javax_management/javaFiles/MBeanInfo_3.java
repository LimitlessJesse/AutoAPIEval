import javax.management.MBeanAttributeInfo;
import javax.management.MBeanInfo;

public class MBeanInfo_3 {
    public static void main(String[] args) {
        MBeanInfo mbeanInfo = new MBeanInfo();
        MBeanAttributeInfo[] attributeInfo = mbeanInfo.getAttributes();
        
        // Use the attributeInfo array as needed
    }
}
