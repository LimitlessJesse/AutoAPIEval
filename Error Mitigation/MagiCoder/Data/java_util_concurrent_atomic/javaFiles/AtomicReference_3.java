import java.util.concurrent.atomic.AtomicReference;

public class AtomicReference_3 {
    public static void main(String[] args) {
        AtomicReference<String> atomicReference = new AtomicReference<>("Initial Value");
        String previousValue = atomicReference.getAndSet("New Value");
        System.out.println("Previous Value: " + previousValue);
        System.out.println("Current Value: " + atomicReference.get());
    }
}
