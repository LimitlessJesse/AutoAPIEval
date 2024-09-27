import java.util.concurrent.atomic.AtomicStampedReference;

public class AtomicStampedReference_4 {
    public static void main(String[] args) {
        AtomicStampedReference<String> atomicStampedRef = new AtomicStampedReference<>("Hello", 0);
        String expectedReference = "Hello";
        String newReference = "World";
        int expectedStamp = 0;
        int newStamp = 1;
        boolean result = atomicStampedRef.compareAndSet(expectedReference, newReference, expectedStamp, newStamp);
        System.out.println("Result: " + result);
        System.out.println("Reference: " + atomicStampedRef.getReference());
        System.out.println("Stamp: " + atomicStampedRef.getStamp());
    }
}
