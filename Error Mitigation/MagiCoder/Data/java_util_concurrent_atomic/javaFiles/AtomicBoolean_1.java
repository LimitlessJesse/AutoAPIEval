import java.util.concurrent.atomic.AtomicBoolean;

public class AtomicBoolean_1 {
    public static void main(String[] args) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        boolean expect = false;
        boolean update = true;

        boolean result = atomicBoolean.compareAndSet(expect, update);

        System.out.println("Result: " + result);
        System.out.println("AtomicBoolean: " + atomicBoolean.get());
    }
}
