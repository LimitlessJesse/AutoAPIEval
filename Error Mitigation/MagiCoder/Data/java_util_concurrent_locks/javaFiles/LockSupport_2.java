import java.util.concurrent.locks.LockSupport;

public class LockSupport_2 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("Thread is waiting...");
            LockSupport.park();
            System.out.println("Thread is unparked!");
        });

        thread.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Unparking the thread...");
        LockSupport.unpark(thread);
    }
}
