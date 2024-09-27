import java.util.concurrent.locks.LockSupport;

public class LockSupport_3 {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            System.out.println("Thread is waiting...");
            LockSupport.parkNanos(Thread.currentThread(), 1000000000); // 1 second
            System.out.println("Thread is resumed.");
        });

        t.start();

        try {
            Thread.sleep(5000); // 500 milliseconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("LockSupport_3 thread is unparking the thread...");
        LockSupport.unpark(t);
    }
}
