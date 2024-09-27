import java.util.LinkedList;

public class LinkedList_3 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("First");
        list.add("Second");
        list.add("Third");

        System.out.println("First element: " + list.getFirst());
    }
}
