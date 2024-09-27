import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayList_12 {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("Hello");
        list.add("World");

        Object[] array = list.toArray();

        for (Object obj : array) {
            System.out.println(obj);
        }
    }
}
