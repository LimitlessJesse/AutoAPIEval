import java.util.concurrent.locks.AbstractQueuedSynchronizer;

public class AbstractQueuedSynchronizer_2 {
    
    static class CustomSync extends AbstractQueuedSynchronizer {
        
        void acquire(int arg) {
            acquireShared(arg);
        }
        
    }
    
    public static void main(String[] args) {
        CustomSync sync = new CustomSync();
        sync.acquire(1);
    }
}
