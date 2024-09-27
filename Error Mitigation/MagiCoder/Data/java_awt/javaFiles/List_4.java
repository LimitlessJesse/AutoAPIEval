import java.awt.List;

public class List_4 {
    public static void main(String[] args) {
        List list = new List();
        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");

        System.out.println("Before clear: " + list);

        list.removeAll();

        System.out.println("After clear: " + list);
    }
}
