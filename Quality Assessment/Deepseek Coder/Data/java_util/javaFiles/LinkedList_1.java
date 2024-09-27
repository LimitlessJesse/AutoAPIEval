import java.util.LinkedList;

public class LinkedList_1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        boolean result = list.add("Hello");
        System.out.println(list);
        System.out.println("Add operation was successful: " + result);
    }
}
