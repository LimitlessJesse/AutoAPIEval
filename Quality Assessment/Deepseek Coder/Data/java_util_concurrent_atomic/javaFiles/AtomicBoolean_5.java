import java.util.concurrent.atomic.AtomicBoolean;

public class AtomicBoolean_5 {
    public static void main(String[] args) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        boolean expectedValue = true;
        boolean newValue = false;

        boolean result = atomicBoolean.compareAndSet(expectedValue, newValue);

        System.out.println("The result of the compareAndSet operation is: " + result);
        System.out.println("The current value of the AtomicBoolean is: " + atomicBoolean.get());
    }
}
