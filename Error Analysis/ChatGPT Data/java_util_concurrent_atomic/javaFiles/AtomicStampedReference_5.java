import java.util.concurrent.atomic.AtomicStampedReference;

public class AtomicStampedReference_5 {
    public static void main(String[] args) {
        AtomicStampedReference<String> reference = new AtomicStampedReference<>("oldValue", 0);
        int expectedStamp = 0;
        int newStamp = 1;
        
        boolean success = reference.compareAndSet("oldValue", "newValue", expectedStamp, newStamp);
        System.out.println("Update successful: " + success);
    }
}
