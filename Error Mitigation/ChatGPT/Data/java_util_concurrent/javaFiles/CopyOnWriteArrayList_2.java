import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayList_2 {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("Hello");
        System.out.println("List before clear: " + list);
        
        list.clear();
        System.out.println("List after clear: " + list);
    }
}
