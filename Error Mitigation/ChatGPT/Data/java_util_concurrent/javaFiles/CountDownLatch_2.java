import java.util.concurrent.CountDownLatch;

public class CountDownLatch_2 {
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(1);
        
        // Decrement the count of the latch
        latch.countDown();
    }
}
