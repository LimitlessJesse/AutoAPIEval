import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayList_4 {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("Hello");
        list.add("World");

        System.out.println(list.contains("Hello"));  // Outputs: true
        System.out.println(list.contains("Java"));  // Outputs: false
    }
}
