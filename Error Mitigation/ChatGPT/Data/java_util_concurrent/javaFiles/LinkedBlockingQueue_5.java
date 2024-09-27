import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueue_5 {
    public static void main(String[] args) {
        LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<>();
        queue.add("First");
        queue.add("Second");
        queue.add("Third");

        System.out.println("Queue before removal: " + queue);

        boolean removed = queue.remove("Second");

        System.out.println("Element 'Second' removed: " + removed);
        System.out.println("Queue after removal: " + queue);
    }
}
