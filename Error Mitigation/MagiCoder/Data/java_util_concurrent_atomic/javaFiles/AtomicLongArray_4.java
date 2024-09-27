import java.util.concurrent.atomic.AtomicLongArray;

public class AtomicLongArray_4 {
    public static void main(String[] args) {
        AtomicLongArray atomicLongArray = new AtomicLongArray(10);
        long oldValue = atomicLongArray.getAndSet(0, 100);
        System.out.println("Old value: " + oldValue);
    }
}
