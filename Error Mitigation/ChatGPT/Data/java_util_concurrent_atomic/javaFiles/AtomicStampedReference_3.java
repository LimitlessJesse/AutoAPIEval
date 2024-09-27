import java.util.concurrent.atomic.AtomicStampedReference;

public class AtomicStampedReference_3 {
    public static void main(String[] args) {
        AtomicStampedReference<String> atomicStampedRef = new AtomicStampedReference<>("Value", 0);
        int stamp = atomicStampedRef.getStamp();
        System.out.println("Stamp value: " + stamp);
    }
}
