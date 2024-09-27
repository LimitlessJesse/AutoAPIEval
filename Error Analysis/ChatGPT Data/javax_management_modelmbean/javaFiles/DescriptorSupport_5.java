import javax.management.modelmbean.DescriptorSupport;

public class DescriptorSupport_5 {
    public static void main(String[] args) {
        DescriptorSupport descriptor = new DescriptorSupport();
        boolean isValid = descriptor.isValid();
        System.out.println("Is descriptor valid? " + isValid);
    }
}
