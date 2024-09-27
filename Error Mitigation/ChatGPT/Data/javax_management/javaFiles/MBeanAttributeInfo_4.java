import javax.management.MBeanAttributeInfo;

public class MBeanAttributeInfo_4 {
    public static void main(String[] args) {
        MBeanAttributeInfo attributeInfo = new MBeanAttributeInfo("attributeName", "attributeType", "attributeDescription", true, true, false);
        boolean isWritable = attributeInfo.isWritable();
        System.out.println("Is attribute writable: " + isWritable);
    }
}
