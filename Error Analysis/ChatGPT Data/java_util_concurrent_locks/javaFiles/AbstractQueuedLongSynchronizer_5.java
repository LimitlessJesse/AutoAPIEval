import java.util.concurrent.locks.AbstractQueuedLongSynchronizer;

public class AbstractQueuedLongSynchronizer_5 {
    
    static class CustomSync extends AbstractQueuedLongSynchronizer {
        
        boolean isHeldExclusively() {
            return getState() == 1;
        }
    }
    
    public static void main(String[] args) {
        CustomSync sync = new CustomSync();
        sync.acquire(1);
        
        System.out.println(sync.isHeldExclusively()); // Output will be true
    }
}
