import java.util.concurrent.atomic.AtomicReference;

public class AtomicReference_5 {
    public static void main(String[] args) {
        AtomicReference<String> atomicReference = new AtomicReference<>("Initial Reference");

        String newReference = "New Reference";
        String previousReference = atomicReference.getAndSet(newReference);

        System.out.println("Previous Reference: " + previousReference);
        System.out.println("Current Reference: " + atomicReference.get());
    }
}
