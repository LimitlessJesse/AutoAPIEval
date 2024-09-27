import java.util.concurrent.atomic.AtomicLong;

public class AtomicLong_1 {
    public static void main(String[] args) {
        AtomicLong atomicLong = new AtomicLong(10);
        long result = atomicLong.get();
        System.out.println("The current value is: " + result);
    }
}
