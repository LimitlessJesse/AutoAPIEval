import java.util.concurrent.locks.LockSupport;

public class LockSupport_4 {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            System.out.println("Thread is parked");
            LockSupport.parkUntil(System.currentTimeMillis() + 1000);
            System.out.println("Thread is unparked");
        });

        t.start();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("LockSupport_4 thread is unparking the other thread");
        LockSupport.unpark(t);
    }
}
