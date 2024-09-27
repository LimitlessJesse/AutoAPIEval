import java.util.concurrent.atomic.AtomicStampedReference;

public class AtomicStampedReference_1 {
    public static void main(String[] args) {
        AtomicStampedReference<String> atomicStampedReference = new AtomicStampedReference<>("oldValue", 0);
        
        String expectedReference = "oldValue";
        String newReference = "newValue";
        int expectedStamp = 0;
        int newStamp = 1;
        
        boolean result = atomicStampedReference.compareAndSet(expectedReference, newReference, expectedStamp, newStamp);
        
        System.out.println("Result: " + result);
        System.out.println("Updated Reference: " + atomicStampedReference.getReference());
        System.out.println("Updated Stamp: " + atomicStampedReference.getStamp());
    }
}
