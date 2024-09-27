import java.util.concurrent.atomic.AtomicStampedReference;

public class AtomicStampedReference_2 {
    public static void main(String[] args) {
        AtomicStampedReference<String> atomicStampedReference = new AtomicStampedReference<>("Initial Value", 0);
        String reference = atomicStampedReference.getReference();
        System.out.println("Current Reference: " + reference);
    }
}
