import javax.management.modelmbean.DescriptorSupport;
import javax.management.RuntimeOperationsException;

public class DescriptorSupport_1 {
    public static void main(String[] args) {
        DescriptorSupport descriptor = new DescriptorSupport();
        
        try {
            descriptor.setField("fieldName", "fieldValue");
        } catch (RuntimeOperationsException e) {
            e.printStackTrace();
        }
    }
}
