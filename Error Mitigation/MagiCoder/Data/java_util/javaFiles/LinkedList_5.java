import java.util.LinkedList;

public class LinkedList_5 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Hello");
        list.add("World");
        list.add("Java");
        System.out.println("Original list: " + list);

        // Remove the element at index 1
        String removedElement = list.remove(1);
        System.out.println("Removed element: " + removedElement);
        System.out.println("Updated list: " + list);
    }
}
