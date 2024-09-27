import java.util.concurrent.atomic.AtomicStampedReference;

public class AtomicStampedReference_4 {
    public static void main(String[] args) {
        AtomicStampedReference<String> atomicStampedRef = new AtomicStampedReference<>("oldValue", 0);
        int expectedStamp = 0;
        int newStamp = 1;
        boolean result = atomicStampedRef.weakCompareAndSet("oldValue", "newValue", expectedStamp, newStamp);
        System.out.println("Update successful: " + result);
    }
}
