import java.util.concurrent.atomic.AtomicIntegerArray;

public class AtomicIntegerArray_5 {
    public static void main(String[] args) {
        AtomicIntegerArray array = new AtomicIntegerArray(5);
        array.set(0, 1);
        System.out.println("Initial value at index 0: " + array.get(0));
        
        int updatedValue = array.incrementAndGet(0);
        System.out.println("Updated value at index 0: " + updatedValue);
    }
}
