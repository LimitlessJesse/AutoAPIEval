import javax.management.MBeanAttributeInfo;

public class MBeanAttributeInfo_5 {
    public static void main(String[] args) {
        // Create an instance of MBeanAttributeInfo
        MBeanAttributeInfo attributeInfo = new MBeanAttributeInfo("attributeName", "attributeType", "attributeDescription", true, false, false);
        
        // Use isIs() method to check if the attribute is a boolean getter
        boolean isBooleanGetter = attributeInfo.isIs();

        System.out.println("Is boolean getter: " + isBooleanGetter);
    }
}
