import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayList_4 {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("Hello");
        boolean contains = list.contains("Hello");
        System.out.println(contains);  // Output: true
    }
}
