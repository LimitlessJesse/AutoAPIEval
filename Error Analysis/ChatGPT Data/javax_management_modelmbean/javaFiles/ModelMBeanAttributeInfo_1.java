import javax.management.modelmbean.ModelMBeanAttributeInfo;

public class ModelMBeanAttributeInfo_1 {
    public static void main(String[] args) {
        ModelMBeanAttributeInfo info = new ModelMBeanAttributeInfo("attributeName", "attributeType", "attributeDescription", true, true, false);
        
        String descriptor = info.getDescriptor().toString();
        System.out.println("Descriptor: " + descriptor);
    }
}
