import javax.management.MBeanAttributeInfo;

public class MBeanAttributeInfo_3 {
    public static void main(String[] args) {
        MBeanAttributeInfo attributeInfo = new MBeanAttributeInfo("attributeName", "attributeType", "attributeDescription", true, false, false);
        boolean isReadable = attributeInfo.isReadable();
        System.out.println("Is attribute readable? " + isReadable);
    }
}
