import javax.management.MBeanAttributeInfo;

public class MBeanAttributeInfo_5 {
    public static void main(String[] args) {
        MBeanAttributeInfo attributeInfo = new MBeanAttributeInfo("attributeName", "attributeType", "attributeDescription", true, false, false);
        boolean hasIsGetter = attributeInfo.isIs();
        System.out.println("Attribute has 'is' getter: " + hasIsGetter);
    }
}
