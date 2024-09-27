import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayList_26 {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("Hello");
        list.add("World");

        list.forEach(System.out::println);
    }
}
