import java.util.concurrent.atomic.AtomicStampedReference;

public class AtomicStampedReference_2 {
    public static void main(String[] args) {
        AtomicStampedReference<String> atomicStampedRef = new AtomicStampedReference<>("Hello", 1);
        System.out.println(atomicStampedRef.getReference());
    }
}
