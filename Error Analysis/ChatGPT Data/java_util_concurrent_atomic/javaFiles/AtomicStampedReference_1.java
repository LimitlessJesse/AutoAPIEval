import java.util.concurrent.atomic.AtomicStampedReference;

public class AtomicStampedReference_1 {
    public static void main(String[] args) {
        AtomicStampedReference<String> atomicStampedRef = new AtomicStampedReference<>("Value", 0);
        
        // Set the reference to a new value with a new stamp
        atomicStampedRef.set("NewValue", 1);
        
        System.out.println("Updated Reference: " + atomicStampedRef.getReference());
        System.out.println("Updated Stamp: " + atomicStampedRef.getStamp());
    }
}
