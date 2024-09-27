import java.util.concurrent.atomic.AtomicBoolean;

public class AtomicBoolean_2 {
    public static void main(String[] args) {
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        atomicBoolean.set(true);
        System.out.println(atomicBoolean.get());
    }
}
