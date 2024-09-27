import java.util.concurrent.atomic.AtomicIntegerArray;

public class AtomicIntegerArray_4 {
    public static void main(String[] args) {
        AtomicIntegerArray array = new AtomicIntegerArray(5);
        int initialValue = 5;
        int updatedValue = array.getAndIncrement(0);
        System.out.println("Initial value: " + initialValue);
        System.out.println("Updated value: " + updatedValue);
    }
}
