import javax.management.modelmbean.DescriptorSupport;

public class DescriptorSupport_5 {
    public static void main(String[] args) {
        DescriptorSupport descriptor = new DescriptorSupport();
        descriptor.setField("fieldName1", "fieldValue1");
        descriptor.setField("fieldName2", "fieldValue2");

        System.out.println("Before removing field:");
        System.out.println(descriptor);

        descriptor.removeField("fieldName1");

        System.out.println("After removing field:");
        System.out.println(descriptor);
    }
}
