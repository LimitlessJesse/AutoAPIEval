import java.util.concurrent.atomic.AtomicInteger;

public class AtomicInteger_16 {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        atomicInteger.set(5);
        System.out.println(atomicInteger.get());
    }
}
