import java.util.concurrent.atomic.AtomicInteger;

public class AtomicInteger_17 {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        atomicInteger.lazySet(10);
        System.out.println(atomicInteger.get());
    }
}
