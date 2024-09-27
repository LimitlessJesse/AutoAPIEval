import java.util.concurrent.atomic.AtomicReferenceArray;

public class AtomicReferenceArray_7 {
    public static void main(String[] args) {
        AtomicReferenceArray<String> array = new AtomicReferenceArray<>(3);
        array.lazySet(0, "Hello");
        array.lazySet(1, "World");
        array.lazySet(2, "!");

        System.out.println(array.get(0));
        System.out.println(array.get(1));
        System.out.println(array.get(2));
    }
}
