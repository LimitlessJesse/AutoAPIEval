import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayList_5 {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("Hello");
        list.add("World");
        System.out.println(list.get(0));  // Output: Hello
        System.out.println(list.get(1));  // Output: World
    }
}
