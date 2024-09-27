import java.util.concurrent.atomic.AtomicLongArray;

public class AtomicLongArray_9 {
    public static void main(String[] args) {
        AtomicLongArray atomicLongArray = new AtomicLongArray(10);
        atomicLongArray.set(0, 10);
        long updatedValue = atomicLongArray.decrementAndGet(0);
        System.out.println("Updated value: " + updatedValue);
    }
}
