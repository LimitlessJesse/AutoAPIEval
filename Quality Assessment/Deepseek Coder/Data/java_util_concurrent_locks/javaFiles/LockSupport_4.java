import java.util.concurrent.locks.LockSupport;

public class LockSupport_4 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("Before unpark");
            LockSupport.park();
            System.out.println("After unpark");
        });

        thread.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        LockSupport.unpark(thread);
    }
}
