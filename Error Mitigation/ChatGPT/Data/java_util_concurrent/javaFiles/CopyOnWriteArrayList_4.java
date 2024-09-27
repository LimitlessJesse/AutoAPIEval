import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayList_4 {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("Hello");
        list.add("World");
        System.out.println("Original list: " + list);

        // Replacing element at index 1
        String replacedElement = list.set(1, "Java");
        System.out.println("Element replaced: " + replacedElement);
        System.out.println("Updated list: " + list);
    }
}
