import java.util.LinkedList;

public class LinkedList_5 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("First");
        list.add("Second");
        list.add("Third");

        String lastElement = list.getLast();
        System.out.println("The last element in the list is: " + lastElement);
    }
}
