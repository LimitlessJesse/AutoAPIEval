import java.util.concurrent.LinkedBlockingDeque;
import java.util.Iterator;

public class LinkedBlockingDeque_5 {
    public static void main(String[] args) {
        LinkedBlockingDeque<String> deque = new LinkedBlockingDeque<>();
        deque.add("First");
        deque.add("Second");
        
        Iterator<String> descendingIterator = deque.descendingIterator();
        while (descendingIterator.hasNext()) {
            System.out.println(descendingIterator.next());
        }
    }
}
