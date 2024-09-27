import java.util.concurrent.atomic.AtomicLong;

public class AtomicLong_5 {
    public static void main(String[] args) {
        AtomicLong atomicLong = new AtomicLong(10);
        long result = atomicLong.addAndGet(5);
        System.out.println("Result: " + result); // Output: Result: 15
    }
}
