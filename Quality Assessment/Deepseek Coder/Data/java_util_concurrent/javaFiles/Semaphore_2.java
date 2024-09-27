import java.util.concurrent.Semaphore;

public class Semaphore_2 {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);

        new Thread(() -> {
            try {
                semaphore.acquire();
                System.out.println("Thread 1 is running");
                Thread.sleep(2000);
                System.out.println("Thread 1 is done");
                semaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                semaphore.acquire();
                System.out.println("Thread 2 is running");
                Thread.sleep(2000);
                System.out.println("Thread 2 is done");
                semaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
