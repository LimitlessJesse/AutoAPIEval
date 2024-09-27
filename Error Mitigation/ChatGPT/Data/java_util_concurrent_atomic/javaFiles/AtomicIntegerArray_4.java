import java.util.concurrent.atomic.AtomicIntegerArray;

public class AtomicIntegerArray_4 {
    public static void main(String[] args) {
        AtomicIntegerArray array = new AtomicIntegerArray(5);
        array.set(0, 10);
        
        int index = 0;
        int expectedValue = 10;
        int newValue = 20;
        
        boolean success = array.compareAndSet(index, expectedValue, newValue);
        
        if(success) {
            System.out.println("Value updated successfully");
        } else {
            System.out.println("Value update failed");
        }
    }
}
