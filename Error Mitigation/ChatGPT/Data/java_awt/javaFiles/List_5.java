import java.awt.List;

public class List_5 {
    public static void main(String[] args) {
        List list = new List();
        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");
        
        int itemCount = list.getItemCount();
        System.out.println("Number of items in the list: " + itemCount);
    }
}
