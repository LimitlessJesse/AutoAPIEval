import java.util.LinkedList;

public class LinkedList_4 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Hello");
        list.add("World");
        
        System.out.println("List: " + list);
        
        String lastElement = list.getLast();
        System.out.println("Last Element: " + lastElement);
    }
}
