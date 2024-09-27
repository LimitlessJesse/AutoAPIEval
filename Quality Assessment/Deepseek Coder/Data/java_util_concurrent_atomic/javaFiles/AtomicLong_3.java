import java.util.concurrent.atomic.AtomicLong;

public class AtomicLong_3 {
    public static void main(String[] args) {
        AtomicLong atomicLong = new AtomicLong(5);
        long result = atomicLong.getAndDecrement();
        System.out.println("Initial value: " + result);
        System.out.println("Current value: " + atomicLong.get());
    }
}
