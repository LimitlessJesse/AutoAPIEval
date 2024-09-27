import java.util.concurrent.atomic.AtomicStampedReference;

public class AtomicStampedReference_3 {
    public static void main(String[] args) {
        // Initialize a new AtomicStampedReference
        AtomicStampedReference<String> ref = new AtomicStampedReference<>("A", 0);

        // Get the current reference and stamp
        String expectedReference = ref.getReference();
        int expectedStamp = ref.getStamp();

        // Try to update the reference
        boolean success = ref.compareAndSet(expectedReference, "B", expectedStamp, expectedStamp+1);

        // Print the result
        if (success) {
            System.out.println("Update successful");
        } else {
            System.out.println("Update failed");
        }

        // Print the updated reference
        System.out.println("Updated reference: " + ref.getReference());
    }
}
