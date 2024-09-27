import java.util.concurrent.atomic.AtomicLongArray;

public class AtomicLongArray_5 {
    public static void main(String[] args) {
        AtomicLongArray array = new AtomicLongArray(5);
        array.set(0, 10);
        
        long previousValue = array.getAndAdd(0, 5);
        
        System.out.println("Previous value: " + previousValue);
        System.out.println("Current value at index 0: " + array.get(0));
    }
}
