import java.awt.List;

public class List_5 {
    public static void main(String[] args) {
        List list = new List();
        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");

        System.out.println("Original list: " + list);

        // Select an item at index 1
        list.select(1);

        System.out.println("Selected item: " + list.getSelectedItem());
    }
}
