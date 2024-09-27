import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayList_5 {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("Hello");
        Object[] array = list.toArray();
        for (Object element : array) {
            System.out.println(element);
        }
    }
}
