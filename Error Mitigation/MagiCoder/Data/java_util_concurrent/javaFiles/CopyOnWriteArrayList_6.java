import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayList_6 {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("Hello");
        list.add("World");
        System.out.println(list.indexOf("Hello"));  // Output: 0
        System.out.println(list.indexOf("World"));  // Output: 1
        System.out.println(list.indexOf("Java"));   // Output: -1
    }
}
