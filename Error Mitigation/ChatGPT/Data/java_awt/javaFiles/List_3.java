import java.awt.List;

public class List_3 {
    public static void main(String[] args) {
        List list = new List();
        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");
        
        System.out.println("Before removal: " + list);
        
        list.remove(1);
        
        System.out.println("After removal: " + list);
    }
}
