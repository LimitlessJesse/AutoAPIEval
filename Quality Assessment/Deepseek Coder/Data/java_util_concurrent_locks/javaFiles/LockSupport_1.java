import java.util.concurrent.locks.LockSupport;

public class LockSupport_1 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("Thread is running");
            LockSupport.park();
            System.out.println("Thread is resumed");
        });

        thread.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("LockSupport_1 thread is unparking the thread");
        LockSupport.unpark(thread);
    }
}
