import java.awt.List;

public class List_2 {
    public static void main(String[] args) {
        List list = new List();
        list.add("Item 1", 0);
        list.add("Item 2", 1);
        list.add("Item 3", 1);
        
        for (int i = 0; i < list.getItemCount(); i++) {
            System.out.println(list.getItem(i));
        }
    }
}
