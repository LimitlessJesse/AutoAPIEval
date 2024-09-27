import java.util.concurrent.atomic.AtomicStampedReference;

public class AtomicStampedReference_5 {
    public static void main(String[] args) {
        // Create a new AtomicStampedReference with initial reference "A" and stamp 1
        AtomicStampedReference<String> ref = new AtomicStampedReference<>("A", 1);

        // Get the current reference and stamp
        String currentRef = ref.getReference();
        int currentStamp = ref.getStamp();

        // Try to weakCompareAndSet the reference to "B" with stamp 2
        boolean success = ref.weakCompareAndSet(currentRef, "B", currentStamp, 2);

        // Print the result of the weakCompareAndSet operation
        System.out.println("Success: " + success);

        // Print the new reference and stamp
        System.out.println("New reference: " + ref.getReference());
        System.out.println("New stamp: " + ref.getStamp());
    }
}
