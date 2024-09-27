import java.util.concurrent.atomic.AtomicLong;

public class AtomicLong_4 {
    public static void main(String[] args) {
        AtomicLong atomicLong = new AtomicLong(0);
        long previousValue = atomicLong.getAndIncrement();
        System.out.println("Previous value: " + previousValue);
        System.out.println("Current value: " + atomicLong.get());
    }
}
