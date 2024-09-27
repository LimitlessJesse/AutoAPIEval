import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayList_14 {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("Hello");
        System.out.println(list);
        list.addIfAbsent("World");
        System.out.println(list);
        list.addIfAbsent("Hello");
        System.out.println(list);
    }
}
