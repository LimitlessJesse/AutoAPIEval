import java.util.concurrent.atomic.AtomicLongArray;

public class AtomicLongArray_8 {
    public static void main(String[] args) {
        AtomicLongArray atomicLongArray = new AtomicLongArray(10);
        int index = 5;
        long updatedValue = atomicLongArray.incrementAndGet(index);
        System.out.println("Updated value at index " + index + " is: " + updatedValue);
    }
}
