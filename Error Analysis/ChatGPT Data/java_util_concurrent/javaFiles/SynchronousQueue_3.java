import java.util.concurrent.SynchronousQueue;

public class SynchronousQueue_3 {
    public static void main(String[] args) {
        SynchronousQueue<String> queue = new SynchronousQueue<>();

        new Thread(() -> {
            try {
                String element = queue.take();
                System.out.println("Received element: " + element);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            String element = "Hello";
            try {
                queue.put(element);
                System.out.println("Sent element: " + element);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
