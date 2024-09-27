import java.util.AbstractSequentialList;
import java.util.ArrayList;

public class AbstractSequentialList_2 {
    public static void main(String[] args) {
        AbstractSequentialList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.set(1, "Java");
        System.out.println(list);
    }
}
