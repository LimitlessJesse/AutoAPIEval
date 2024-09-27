import java.util.concurrent.atomic.AtomicLongArray;

public class AtomicLongArray_6 {
    public static void main(String[] args) {
        AtomicLongArray atomicLongArray = new AtomicLongArray(10);
        atomicLongArray.set(0, 10);
        long previousValue = atomicLongArray.getAndDecrement(0);
        System.out.println("Previous value: " + previousValue);
        System.out.println("Current value: " + atomicLongArray.get(0));
    }
}
