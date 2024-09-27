import java.util.concurrent.atomic.AtomicStampedReference;

public class AtomicStampedReference_2 {
    public static void main(String[] args) {
        AtomicStampedReference<String> atomicRef = new AtomicStampedReference<>("Initial Value", 0);
        String reference = atomicRef.getReference();
        System.out.println("Current reference value: " + reference);
    }
}
