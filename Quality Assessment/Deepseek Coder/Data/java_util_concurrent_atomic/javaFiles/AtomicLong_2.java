import java.util.concurrent.atomic.AtomicLong;

public class AtomicLong_2 {
    public static void main(String[] args) {
        AtomicLong atomicLong = new AtomicLong();
        long currentValue = atomicLong.getAndIncrement();
        System.out.println("Current value: " + currentValue);
        System.out.println("New value: " + atomicLong.get());
    }
}
