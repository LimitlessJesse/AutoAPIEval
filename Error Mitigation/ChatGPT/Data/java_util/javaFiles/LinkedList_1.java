import java.util.LinkedList;

public class LinkedList_1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("World");
        System.out.println("Initial LinkedList: " + list);

        list.addFirst("Hello");
        System.out.println("LinkedList after adding element at the beginning: " + list);
    }
}
