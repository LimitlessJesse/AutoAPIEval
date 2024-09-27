import java.util.concurrent.atomic.AtomicReference;

public class AtomicReference_3 {
    public static void main(String[] args) {
        AtomicReference<String> atomicReference = new AtomicReference<>();
        atomicReference.set("Hello");
        System.out.println(atomicReference.get());
    }
}
