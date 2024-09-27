import java.util.concurrent.CountDownLatch;

public class CountDownLatch_3 {
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(1);
        
        try {
            countDown(latch);
            latch.await();
            
            System.out.println("Countdown completed!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    public static void countDown(CountDownLatch latch) {
        new Thread(() -> {
            try {
                Thread.sleep(3000); // Simulate some time-consuming task
                latch.countDown();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
