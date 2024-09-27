import java.util.concurrent.atomic.AtomicLong;

public class AtomicLong_1 {
    public static void main(String[] args) {
        AtomicLong atomicLong = new AtomicLong(10);
        long value = atomicLong.get();
        System.out.println("Current value: " + value);
    }
}
