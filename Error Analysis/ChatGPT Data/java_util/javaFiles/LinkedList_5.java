import java.util.LinkedList;

public class LinkedList_5 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");

        System.out.println("Before removing first element: " + linkedList);

        linkedList.removeFirst();

        System.out.println("After removing first element: " + linkedList);
    }
}
