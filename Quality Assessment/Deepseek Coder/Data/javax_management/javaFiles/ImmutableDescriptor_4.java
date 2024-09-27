import javax.management.ImmutableDescriptor;

public class ImmutableDescriptor_4 {
    public static void main(String[] args) {
        ImmutableDescriptor desc1 = new ImmutableDescriptor("desc1");
        ImmutableDescriptor desc2 = new ImmutableDescriptor("desc2");

        boolean isEqual = desc1.equals(desc2);
        System.out.println("Are the two descriptors equal? " + isEqual);
    }
}
