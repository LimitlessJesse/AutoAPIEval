import java.util.concurrent.atomic.AtomicLong;

public class AtomicLong_2 {
    public static void main(String[] args) {
        AtomicLong atomicLong = new AtomicLong(10);
        System.out.println("Current value: " + atomicLong.get());
        
        atomicLong.set(20);
        System.out.println("New value: " + atomicLong.get());
    }
}
