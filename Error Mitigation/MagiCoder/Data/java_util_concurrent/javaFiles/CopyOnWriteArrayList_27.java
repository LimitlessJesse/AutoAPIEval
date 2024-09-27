import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayList_27 {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("Hello");
        list.add("World");

        // Using spliterator
        list.spliterator().forEachRemaining(System.out::println);
    }
}
