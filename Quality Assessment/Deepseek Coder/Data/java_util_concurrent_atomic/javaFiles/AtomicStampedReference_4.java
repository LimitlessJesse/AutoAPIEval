import java.util.concurrent.atomic.AtomicStampedReference;

public class AtomicStampedReference_4 {
    public static void main(String[] args) {
        // Create a new AtomicStampedReference
        AtomicStampedReference<String> ref = new AtomicStampedReference<>("A", 0);

        // Set a new reference and stamp
        ref.set("B", 1);

        // Print the new reference and stamp
        System.out.println("Reference: " + ref.getReference() + ", Stamp: " + ref.getStamp());
    }
}
