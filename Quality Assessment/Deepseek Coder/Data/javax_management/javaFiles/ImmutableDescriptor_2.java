import javax.management.ImmutableDescriptor;

public class ImmutableDescriptor_2 {
    public static void main(String[] args) {
        ImmutableDescriptor descriptor = new ImmutableDescriptor("MyDescriptor", "MyClass", "MyField");
        System.out.println(descriptor.toString());
    }
}
