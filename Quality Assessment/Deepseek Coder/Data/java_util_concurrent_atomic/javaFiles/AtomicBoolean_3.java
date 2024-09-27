import java.util.concurrent.atomic.AtomicBoolean;

public class AtomicBoolean_3 {
    public static void main(String[] args) {
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        boolean newValue = true;

        // Get the current value
        boolean currentValue = atomicBoolean.get();
        System.out.println("Current value: " + currentValue);

        // Set the new value and get the previous value
        boolean previousValue = atomicBoolean.getAndSet(newValue);
        System.out.println("Previous value: " + previousValue);

        // Get the new value
        currentValue = atomicBoolean.get();
        System.out.println("New value: " + currentValue);
    }
}
