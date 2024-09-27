import java.util.ArrayList;
import java.util.Collections;

public class Collections_2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        System.out.println("Before shuffle: " + list);

        Collections.shuffle(list);

        System.out.println("After shuffle: " + list);
    }
}
