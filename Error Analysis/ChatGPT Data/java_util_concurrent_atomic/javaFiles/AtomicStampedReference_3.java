import java.util.concurrent.atomic.AtomicStampedReference;

public class AtomicStampedReference_3 {
    public static void main(String[] args) {
        AtomicStampedReference<Integer> atomicStampedReference = new AtomicStampedReference<>(100, 0);
        int stamp = atomicStampedReference.getStamp();
        System.out.println("Stamp: " + stamp);
    }
}
