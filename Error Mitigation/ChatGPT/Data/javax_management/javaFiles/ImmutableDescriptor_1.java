import javax.management.ImmutableDescriptor;

public class ImmutableDescriptor_1 {
    public static void main(String[] args) {
        ImmutableDescriptor descriptor = new ImmutableDescriptor(new String[]{"key1", "value1", "key2", "value2"});
        Object value = descriptor.getFieldValue("key1");
        System.out.println("Value for key1: " + value);
    }
}
