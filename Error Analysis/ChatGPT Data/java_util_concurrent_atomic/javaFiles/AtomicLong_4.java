import java.util.concurrent.atomic.AtomicLong;

public class AtomicLong_4 {
    public static void main(String[] args) {
        AtomicLong atomicLong = new AtomicLong(10);
        System.out.println("Original value: " + atomicLong.get());
        
        long decrementedValue = atomicLong.decrementAndGet();
        System.out.println("Decremented value: " + decrementedValue);
    }
}
