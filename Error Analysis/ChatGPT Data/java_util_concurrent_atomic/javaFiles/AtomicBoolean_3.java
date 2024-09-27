import java.util.concurrent.atomic.AtomicBoolean;

public class AtomicBoolean_3 {
    public static void main(String[] args) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        boolean previousValue = atomicBoolean.get();
        boolean newValue = false;
        boolean updated = atomicBoolean.compareAndSet(previousValue, newValue);
        System.out.println("Previous value: " + previousValue);
        System.out.println("New value: " + newValue);
        System.out.println("Updated: " + updated);
    }
}
