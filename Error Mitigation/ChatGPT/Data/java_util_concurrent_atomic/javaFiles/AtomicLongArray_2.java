import java.util.concurrent.atomic.AtomicLongArray;

public class AtomicLongArray_2 {
    public static void main(String[] args) {
        AtomicLongArray array = new AtomicLongArray(5);
        array.set(0, 10);
        array.set(1, 20);
        
        long valueAtIndex0 = array.get(0);
        long valueAtIndex1 = array.get(1);
        
        System.out.println("Value at index 0: " + valueAtIndex0);
        System.out.println("Value at index 1: " + valueAtIndex1);
    }
}
