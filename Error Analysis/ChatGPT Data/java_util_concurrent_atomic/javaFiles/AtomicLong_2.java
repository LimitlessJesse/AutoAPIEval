import java.util.concurrent.atomic.AtomicLong;

public class AtomicLong_2 {
    public static void main(String[] args) {
        AtomicLong atomicLong = new AtomicLong();
        atomicLong.set(10);
        System.out.println(atomicLong.get());
    }
}
