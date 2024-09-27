import java.util.concurrent.atomic.AtomicBoolean;

public class AtomicBoolean_4 {
    public static void main(String[] args) {
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        atomicBoolean.lazySet(true);
        System.out.println(atomicBoolean.get());
    }
}
