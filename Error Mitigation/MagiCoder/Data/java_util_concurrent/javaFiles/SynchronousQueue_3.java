import java.util.concurrent.SynchronousQueue;

public class SynchronousQueue_3 {
    public static void main(String[] args) {
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
                String message = queue.poll();
                System.out.println(message);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
    }
}
