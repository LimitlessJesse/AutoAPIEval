import java.util.ArrayList;

public class ArrayList_3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        System.out.println(list);  // Output: [Hello, World]

        boolean isRemoved = list.remove("World");
        System.out.println(list);  // Output: [Hello]
        System.out.println(isRemoved);  // Output: true

        isRemoved = list.remove("Goodbye");
        System.out.println(list);  // Output: []
        System.out.println(isRemoved);  // Output: false
    }
}
