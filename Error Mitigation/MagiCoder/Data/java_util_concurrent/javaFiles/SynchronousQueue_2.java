import java.util.concurrent.SynchronousQueue;

public class SynchronousQueue_2 {
    public static void main(String[] args) throws InterruptedException {
        SynchronousQueue<String> queue = new SynchronousQueue<>();

        // Thread 1
        new Thread(() -> {
            try {
                queue.put("Hello");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        // Thread 2
        new Thread(() -> {
            try {
                String message = queue.take();
                System.out.println(message);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
