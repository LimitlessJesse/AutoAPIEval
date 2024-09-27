import java.util.concurrent.SynchronousQueue;

public class SynchronousQueue_2 {
    public static void main(String[] args) throws InterruptedException {
        SynchronousQueue<String> queue = new SynchronousQueue<>();
        
        // Inserting an element into the queue
        new Thread(() -> {
            try {
                queue.put("Element");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        
        // Removing the head of the queue
        String element = queue.take();
        System.out.println("Removed element: " + element);
    }
}
