import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.UnaryOperator;

public class CopyOnWriteArrayList_16 {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("Hello");
        list.add("World");
        System.out.println("Original list: " + list);

        UnaryOperator<String> operator = s -> s.toUpperCase();
        list.replaceAll(operator);

        System.out.println("List after replaceAll: " + list);
    }
}
