import java.util.concurrent.atomic.AtomicBoolean;

public class AtomicBoolean_1 {
    public static void main(String[] args) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        boolean value = atomicBoolean.get();
        System.out.println(value);
    }
}
