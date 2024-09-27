import java.util.concurrent.atomic.AtomicLong;

public class AtomicLong_3 {
    public static void main(String[] args) {
        AtomicLong atomicLong = new AtomicLong(10);
        long previousValue = atomicLong.getAndSet(20);
        System.out.println("Previous value: " + previousValue);
        System.out.println("Current value: " + atomicLong.get());
    }
}
