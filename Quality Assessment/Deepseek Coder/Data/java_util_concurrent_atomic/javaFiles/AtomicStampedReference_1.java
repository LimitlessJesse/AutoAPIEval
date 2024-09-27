import java.util.concurrent.atomic.AtomicStampedReference;

public class AtomicStampedReference_1 {
    public static void main(String[] args) {
        String reference = new String("Hello");
        int stamp = 1;
        AtomicStampedReference<String> atomicStampedRef = new AtomicStampedReference<>(reference, stamp);

        System.out.println("Reference: " + atomicStampedRef.getReference());
        System.out.println("Stamp: " + atomicStampedRef.getStamp());
    }
}
