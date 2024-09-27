import java.util.ArrayList;

public class ArrayList_5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        System.out.println("Before removing: " + list);
        list.remove(0);
        System.out.println("After removing: " + list);
    }
}
