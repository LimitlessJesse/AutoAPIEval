import java.util.ArrayList;

public class ArrayList_1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        boolean isAdded = list.add("Hello");
        System.out.println("Element added successfully: " + isAdded);
        System.out.println(list);
    }
}
