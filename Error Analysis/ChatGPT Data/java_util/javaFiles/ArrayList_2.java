import java.util.ArrayList;

public class ArrayList_2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add(0, "World");
        System.out.println(list); // Output: [World, Hello]
    }
}
