import java.util.concurrent.SynchronousQueue;

public class SynchronousQueue_4 {
    public static void main(String[] args) {
        SynchronousQueue<String> queue = new SynchronousQueue<>();
        try {
            queue.put("Element");
            String element = queue.poll();
            System.out.println("Retrieved element: " + element);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
