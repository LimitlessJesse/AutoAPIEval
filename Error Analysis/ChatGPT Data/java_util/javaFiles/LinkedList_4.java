import java.util.LinkedList;

public class LinkedList_4 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        // Get the last element
        String lastElement = list.getLast();
        System.out.println("Last Element: " + lastElement);
    }
}
