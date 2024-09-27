import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayList_5 {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("Hello");
        list.add("World");

        String element = list.get(1);
        System.out.println(element);  // Output: World
    }
}
