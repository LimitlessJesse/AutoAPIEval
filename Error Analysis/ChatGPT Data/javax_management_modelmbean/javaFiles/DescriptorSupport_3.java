import javax.management.modelmbean.DescriptorSupport;

public class DescriptorSupport_3 {
    public static void main(String[] args) {
        DescriptorSupport descriptor = new DescriptorSupport();
        String[] fields = descriptor.getFields();
        
        for (String field : fields) {
            System.out.println(field);
        }
    }
}
