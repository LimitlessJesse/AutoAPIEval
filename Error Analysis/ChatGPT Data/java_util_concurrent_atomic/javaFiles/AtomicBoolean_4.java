import java.util.concurrent.atomic.AtomicBoolean;

public class AtomicBoolean_4 {
    public static void main(String[] args) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        System.out.println("Current value: " + atomicBoolean.getAndSet(true));
        System.out.println("New value: " + atomicBoolean.get());
    }
}
