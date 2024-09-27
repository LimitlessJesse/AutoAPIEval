import java.util.concurrent.atomic.AtomicLongArray;

public class AtomicLongArray_4 {
    public static void main(String[] args) {
        AtomicLongArray array = new AtomicLongArray(5);
        array.set(0, 10);
        
        int index = 0;
        long expected = 10;
        long update = 20;
        
        boolean result = array.compareAndSet(index, expected, update);
        
        System.out.println("Element at index " + index + " updated successfully: " + result);
        System.out.println("New value at index " + index + ": " + array.get(index));
    }
}
