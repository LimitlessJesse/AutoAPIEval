import java.util.concurrent.atomic.AtomicLong;

public class AtomicLong_3 {
    public static void main(String[] args) {
        AtomicLong atomicLong = new AtomicLong(10);
        long updatedValue = atomicLong.incrementAndGet();
        System.out.println("Updated value: " + updatedValue);
    }
}
