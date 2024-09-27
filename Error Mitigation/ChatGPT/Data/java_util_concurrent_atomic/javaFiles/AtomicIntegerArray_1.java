import java.util.concurrent.atomic.AtomicIntegerArray;

public class AtomicIntegerArray_1 {
    public static void main(String[] args) {
        AtomicIntegerArray array = new AtomicIntegerArray(5);
        array.set(0, 10);
        array.set(1, 20);
        
        int valueAtIndex1 = array.get(1);
        System.out.println("Value at index 1: " + valueAtIndex1);
    }
}
