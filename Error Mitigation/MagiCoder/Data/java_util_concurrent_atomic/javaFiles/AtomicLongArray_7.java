import java.util.concurrent.atomic.AtomicLongArray;

public class AtomicLongArray_7 {
    public static void main(String[] args) {
        AtomicLongArray atomicLongArray = new AtomicLongArray(10);
        long previousValue = atomicLongArray.getAndAdd(5, 10);
        System.out.println("Previous value: " + previousValue);
    }
}
