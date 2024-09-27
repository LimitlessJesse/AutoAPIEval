import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class CountDownLatch_3 {
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(3);

        new Thread(() -> {
            try {
                Thread.sleep(2000);
                latch.countDown();
                System.out.println("Count down 1");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                Thread.sleep(1000);
                latch.countDown();
                System.out.println("Count down 2");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                Thread.sleep(3000);
                latch.countDown();
                System.out.println("Count down 3");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        try {
            System.out.println("Waiting for latch to count down to zero...");
            if (latch.await(5, TimeUnit.SECONDS)) {
                System.out.println("Latch count down to zero");
            } else {
                System.out.println("Timeout reached");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
