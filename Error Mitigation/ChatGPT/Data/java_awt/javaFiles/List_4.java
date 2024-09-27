import java.awt.List;

public class List_4 {
    public static void main(String[] args) {
        List list = new List();
        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");

        String item = list.getItem(1);
        System.out.println("Item at index 1: " + item);
    }
}
