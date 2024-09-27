import javax.management.MBeanAttributeInfo;

public class MBeanAttributeInfo_3 {
    public static void main(String[] args) {
        MBeanAttributeInfo attributeInfo = new MBeanAttributeInfo("attributeName", "attributeType", "attributeDescription", true, false, true);
        
        // Check if the attribute is readable
        if(attributeInfo.isReadable()) {
            System.out.println("Attribute is readable");
        } else {
            System.out.println("Attribute is not readable");
        }
    }
}
