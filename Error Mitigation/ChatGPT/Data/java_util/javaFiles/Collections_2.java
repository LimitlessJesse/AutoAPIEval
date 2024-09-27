import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class Collections_2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        System.out.println("Before shuffling: " + list);

        Collections.shuffle(list);

        System.out.println("After shuffling: " + list);
    }
}
