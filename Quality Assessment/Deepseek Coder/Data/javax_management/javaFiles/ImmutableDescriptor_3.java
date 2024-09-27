import javax.management.ImmutableDescriptor;

public class ImmutableDescriptor_3 {
    public static void main(String[] args) {
        ImmutableDescriptor descriptor = new ImmutableDescriptor();
        int hashCode = descriptor.hashCode();
        System.out.println("Hash code: " + hashCode);
    }
}
