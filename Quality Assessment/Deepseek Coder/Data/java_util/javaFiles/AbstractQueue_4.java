import java.util.AbstractQueue;
import java.util.LinkedList;
import java.util.Queue;

public class AbstractQueue_4 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Hello");
        String head = queue.element();
        System.out.println(head);
    }
}
