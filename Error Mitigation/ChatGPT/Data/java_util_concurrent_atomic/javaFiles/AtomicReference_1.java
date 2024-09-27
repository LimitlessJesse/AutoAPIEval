import java.util.concurrent.atomic.AtomicReference;

public class AtomicReference_1 {
    public static void main(String[] args) {
        AtomicReference<String> atomicReference = new AtomicReference<>("Initial Value");
        System.out.println("Current value: " + atomicReference.get());
        
        atomicReference.set("New Value");
        System.out.println("Updated value: " + atomicReference.get());
    }
}
