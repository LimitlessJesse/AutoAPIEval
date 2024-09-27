import java.util.LinkedList;
import java.util.Arrays;

public class LinkedList_3 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Hello");
        list.add("World");

        LinkedList<String> otherList = new LinkedList<>(Arrays.asList("Java", "Programming"));

        boolean result = list.addAll(otherList);

        System.out.println(result); // true
        System.out.println(list); // [Hello, World, Java, Programming]
    }
}
