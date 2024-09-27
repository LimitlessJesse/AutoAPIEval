import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collections_4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        System.out.println("Before rotating: " + list);

        Collections.rotate(list, 1);

        System.out.println("After rotating by 1: " + list);
    }
}
