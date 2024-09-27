import java.util.concurrent.atomic.AtomicLong;

public class AtomicLong_4 {
    public static void main(String[] args) {
        AtomicLong atomicLong = new AtomicLong(10);
        long updatedValue = atomicLong.decrementAndGet();
        System.out.println("Updated value: " + updatedValue);
    }
}
