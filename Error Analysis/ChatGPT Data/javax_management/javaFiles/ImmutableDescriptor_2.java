import javax.management.ImmutableDescriptor;

public class ImmutableDescriptor_2 {
    public static void main(String[] args) {
        ImmutableDescriptor descriptor = new ImmutableDescriptor(new String[]{"name=John", "age=30"});
        String[] fieldNames = descriptor.getFieldNames();
        
        for(String fieldName : fieldNames) {
            System.out.println(fieldName);
        }
    }
}
