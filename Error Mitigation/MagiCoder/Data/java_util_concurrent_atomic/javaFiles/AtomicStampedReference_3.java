import java.util.concurrent.atomic.AtomicStampedReference;

public class AtomicStampedReference_3 {
    public static void main(String[] args) {
        AtomicStampedReference<String> atomicStampedRef = new AtomicStampedReference<>("Hello", 1);
        int stamp = atomicStampedRef.getStamp();
        System.out.println("Stamp: " + stamp);
    }
}
