import java.awt.List;

public class List_1 {
    public static void main(String[] args) {
        List list = new List();
        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");
        
        String[] items = list.getItems();
        for (String item : items) {
            System.out.println(item);
        }
    }
}
