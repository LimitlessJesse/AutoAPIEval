import java.util.concurrent.atomic.AtomicLong;

public class AtomicLong_5 {
    public static void main(String[] args) {
        AtomicLong atomicLong = new AtomicLong(10);
        long previousValue = atomicLong.getAndDecrement();
        System.out.println("Previous value: " + previousValue);
        System.out.println("Current value: " + atomicLong.get());
    }
}
