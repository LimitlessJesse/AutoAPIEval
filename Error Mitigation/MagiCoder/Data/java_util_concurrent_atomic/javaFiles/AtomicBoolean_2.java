import java.util.concurrent.atomic.AtomicBoolean;

public class AtomicBoolean_2 {
    public static void main(String[] args) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        boolean currentValue = atomicBoolean.get();
        System.out.println("Current value: " + currentValue);
    }
}
