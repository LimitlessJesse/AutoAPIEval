import javax.management.MBeanAttributeInfo;

public class MBeanAttributeInfo_4 {
    public static void main(String[] args) {
        MBeanAttributeInfo attributeInfo = new MBeanAttributeInfo("attributeName", "attributeType", "description", true, false, true);
        boolean isWritable = attributeInfo.isWritable();
        System.out.println("Is Writable: " + isWritable);
    }
}
