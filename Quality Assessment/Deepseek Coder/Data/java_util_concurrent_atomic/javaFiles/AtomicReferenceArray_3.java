import java.util.concurrent.atomic.AtomicReferenceArray;

public class AtomicReferenceArray_3 {
    public static void main(String[] args) {
        AtomicReferenceArray<String> array = new AtomicReferenceArray<>(5);
        array.set(0, "Hello");
        array.set(1, "World");
        array.set(2, "!");
        System.out.println(array.length());
    }
}
