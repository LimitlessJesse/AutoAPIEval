import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayList_2 {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("Hello");
        list.set(0, "World");
        System.out.println(list);
    }
}
