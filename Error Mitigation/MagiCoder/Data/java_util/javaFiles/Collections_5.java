import java.util.ArrayList;
import java.util.Collections;

public class Collections_5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Java");
        list.add("Collections");

        System.out.println("Before shuffle: " + list);

        Collections.shuffle(list);

        System.out.println("After shuffle: " + list);
    }
}
