import java.util.AbstractSequentialList;
import java.util.ArrayList;

public class AbstractSequentialList_3 {
    public static void main(String[] args) {
        AbstractSequentialList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add(1, "Java");
        System.out.println(list);
    }
}
