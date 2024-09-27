import java.util.concurrent.SynchronousQueue;

public class SynchronousQueue_2 {
    public static void main(String[] args) {
        SynchronousQueue<String> queue = new SynchronousQueue<>();

        Thread producerThread = new Thread(() -> {
            try {
                String element = "Hello";
                System.out.println("Producer producing: " + element);
                queue.put(element);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumerThread = new Thread(() -> {
            try {
                String element = queue.take();
                System.out.println("Consumer consumed: " + element);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}
