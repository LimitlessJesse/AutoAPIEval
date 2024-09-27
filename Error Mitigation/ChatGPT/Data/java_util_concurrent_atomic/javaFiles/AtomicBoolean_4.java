import java.util.concurrent.atomic.AtomicBoolean;

public class AtomicBoolean_4 {
    public static void main(String[] args) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        
        boolean previousValue = atomicBoolean.getAndSet(false);
        
        System.out.println("Previous value: " + previousValue);
        System.out.println("Current value: " + atomicBoolean.get());
    }
}
