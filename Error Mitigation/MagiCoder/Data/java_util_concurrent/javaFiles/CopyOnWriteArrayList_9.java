import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayList_9 {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("Hello");
        list.add("World");
        System.out.println(list);
        list.remove("Hello");
        System.out.println(list);
    }
}
