import java.util.LinkedList;

public class LinkedList_2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Hello");
        list.add("World");
        list.add(1, "Java");
        System.out.println(list);
    }
}
