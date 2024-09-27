import java.awt.List;

public class List_3 {
    public static void main(String[] args) {
        List list = new List();
        list.add("First Item");
        list.add("Second Item");
        list.add("Third Item");

        int itemCount = list.getItemCount();
        System.out.println("Number of items in the list: " + itemCount);
    }
}
