import java.util.concurrent.atomic.AtomicLongArray;

public class AtomicLongArray_10 {
    public static void main(String[] args) {
        AtomicLongArray atomicLongArray = new AtomicLongArray(10);
        long newValue = atomicLongArray.addAndGet(5, 10);
        System.out.println("New value: " + newValue);
    }
}
