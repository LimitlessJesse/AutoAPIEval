import java.util.concurrent.atomic.AtomicLong;

public class AtomicLong_10 {
    public static void main(String[] args) {
        AtomicLong atomicLong = new AtomicLong(0);
        long delta = 5;
        long result = atomicLong.addAndGet(delta);
        System.out.println("The updated value is: " + result);
    }
}
