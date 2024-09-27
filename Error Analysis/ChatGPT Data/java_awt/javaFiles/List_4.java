import java.awt.List;

public class List_4 {
    public static void main(String[] args) {
        List list = new List();
        list.add("Apple");
        list.add("Banana");
        
        String itemAtIndex1 = list.getItem(1);
        System.out.println("Item at index 1: " + itemAtIndex1);
    }
}
