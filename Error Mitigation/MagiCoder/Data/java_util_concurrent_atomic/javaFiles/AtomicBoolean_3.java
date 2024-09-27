import java.util.concurrent.atomic.AtomicBoolean;

public class AtomicBoolean_3 {
    public static void main(String[] args) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        atomicBoolean.set(true);
        System.out.println(atomicBoolean.get());
    }
}
