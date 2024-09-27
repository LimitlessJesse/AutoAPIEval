import java.util.concurrent.atomic.AtomicLongArray;

public class AtomicLongArray_5 {
    public static void main(String[] args) {
        AtomicLongArray atomicLongArray = new AtomicLongArray(10);
        System.out.println("Before increment: " + atomicLongArray.get(0));
        System.out.println("After increment: " + atomicLongArray.getAndIncrement(0));
    }
}
