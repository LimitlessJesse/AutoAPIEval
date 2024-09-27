import java.util.concurrent.LinkedBlockingDeque;

public class LinkedBlockingDeque_5 {
    public static void main(String[] args) {
        LinkedBlockingDeque<String> deque = new LinkedBlockingDeque<>();
        boolean offerResult = deque.offer("Hello");
        System.out.println("Offer result: " + offerResult);
    }
}
