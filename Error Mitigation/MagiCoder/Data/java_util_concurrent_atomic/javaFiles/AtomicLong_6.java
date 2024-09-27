import java.util.concurrent.atomic.AtomicLong;

public class AtomicLong_6 {
    public static void main(String[] args) {
        AtomicLong atomicLong = new AtomicLong(0);
        System.out.println(atomicLong.incrementAndGet());
    }
}
