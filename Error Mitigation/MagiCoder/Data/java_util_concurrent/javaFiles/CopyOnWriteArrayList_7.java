import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayList_7 {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        System.out.println(list.isEmpty()); // Output: true
        list.add("Hello");
        System.out.println(list.isEmpty()); // Output: false
    }
}
