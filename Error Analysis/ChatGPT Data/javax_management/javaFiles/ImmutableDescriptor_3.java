import javax.management.ImmutableDescriptor;

public class ImmutableDescriptor_3 {
    public static void main(String[] args) {
        ImmutableDescriptor descriptor = new ImmutableDescriptor(new String[]{"key1", "value1", "key2", "value2"});
        String[] fields = descriptor.getFields();
        
        for(String field : fields) {
            System.out.println(field);
        }
    }
}
