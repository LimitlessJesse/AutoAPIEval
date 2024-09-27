import java.util.LinkedList;

public class LinkedList_4 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Hello");
        list.add("World");
        String first = list.getFirst();
        System.out.println(first);
    }
}
