import javax.management.modelmbean.ModelMBeanAttributeInfo;
import javax.management.modelmbean.Descriptor;

public class ModelMBeanAttributeInfo_2 {
    public static void main(String[] args) {
        ModelMBeanAttributeInfo attributeInfo = new ModelMBeanAttributeInfo("attributeName", "attributeType", "attributeDescription", true, true, false, new Descriptor());
        Descriptor newDescriptor = new Descriptor();
        
        // Setting the descriptor for the attribute info
        attributeInfo.setDescriptor(newDescriptor);
        
        // Getting the descriptor from the attribute info
        Descriptor descriptor = attributeInfo.getDescriptor();
    }
}
