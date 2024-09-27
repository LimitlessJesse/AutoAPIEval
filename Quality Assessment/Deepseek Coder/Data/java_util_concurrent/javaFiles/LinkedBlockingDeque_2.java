import java.util.concurrent.LinkedBlockingDeque;

public class LinkedBlockingDeque_2 {
    public static void main(String[] args) {
        LinkedBlockingDeque<String> deque = new LinkedBlockingDeque<>();
        boolean offerSuccess = deque.offer("Hello");
        System.out.println("Offer Successful: " + offerSuccess);
        System.out.println("Deque: " + deque);
    }
}
