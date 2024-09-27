import java.util.concurrent.atomic.AtomicLongArray;

public class AtomicLongArray_3 {
    public static void main(String[] args) {
        AtomicLongArray array = new AtomicLongArray(5);
        array.set(2, 10);
        System.out.println(array.get(2));
    }
}
