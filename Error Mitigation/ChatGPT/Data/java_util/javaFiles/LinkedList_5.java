import java.util.LinkedList;

public class LinkedList_5 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("First");
        list.add("Second");
        list.add("Third");

        System.out.println("Initial LinkedList: " + list);

        String removedElement = list.removeFirst();
        System.out.println("Removed Element: " + removedElement);
        System.out.println("Updated LinkedList: " + list);
    }
}
