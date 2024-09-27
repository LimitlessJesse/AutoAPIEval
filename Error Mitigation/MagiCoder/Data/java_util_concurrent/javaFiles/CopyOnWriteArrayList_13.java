import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayList_13 {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("Hello");
        list.add("World");

        String[] array = list.toArray(new String[0]);

        for (String s : array) {
            System.out.println(s);
        }
    }
}
