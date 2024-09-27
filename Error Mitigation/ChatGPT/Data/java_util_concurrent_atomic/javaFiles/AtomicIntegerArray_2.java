import java.util.concurrent.atomic.AtomicIntegerArray;

public class AtomicIntegerArray_2 {
    public static void main(String[] args) {
        AtomicIntegerArray array = new AtomicIntegerArray(5);
        array.set(2, 10);
        System.out.println(array.get(2));
    }
}
