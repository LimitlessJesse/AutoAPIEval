import java.util.concurrent.atomic.AtomicBoolean;

public class AtomicBoolean_2 {
    public static void main(String[] args) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        boolean value = atomicBoolean.get();
        System.out.println("Initial value of AtomicBoolean: " + value);
    }
}
