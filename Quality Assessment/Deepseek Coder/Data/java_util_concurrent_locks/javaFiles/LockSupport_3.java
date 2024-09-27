import java.util.concurrent.locks.LockSupport;

public class LockSupport_3 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("Parking thread for 5 seconds");
            LockSupport.parkUntil(System.currentTimeMillis() + 5000);
            System.out.println("Thread unparked");
        });

        thread.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Unparking thread");
        LockSupport.unpark(thread);
    }
}
