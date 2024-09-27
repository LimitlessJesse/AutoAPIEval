import java.util.concurrent.LinkedBlockingDeque;

public class LinkedBlockingDeque_1 {
    public static void main(String[] args) {
        LinkedBlockingDeque<String> deque = new LinkedBlockingDeque<>();
        
        try {
            deque.put("Hello");
            System.out.println("Element added successfully");
        } catch (InterruptedException e) {
            System.out.println("Interrupted while waiting to add element");
        }
    }
}
