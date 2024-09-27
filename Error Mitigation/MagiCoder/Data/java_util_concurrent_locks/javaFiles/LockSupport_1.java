import java.util.concurrent.locks.LockSupport;

public class LockSupport_1 {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            System.out.println("Thread is waiting...");
            LockSupport.park();
            System.out.println("Thread is resumed.");
        });

        t.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("LockSupport_1 thread is unparking the thread...");
        LockSupport.unpark(t);
    }
}
