import java.util.AbstractList;
import java.util.ArrayList;

public class AbstractList_2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        System.out.println(list.get(0));  // Output: Hello
        System.out.println(list.get(1));  // Output: World
    }
}
