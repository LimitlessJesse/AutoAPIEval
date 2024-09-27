import java.util.ArrayList;

public class ArrayList_1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        boolean result = list.add("Hello");
        System.out.println(list);
        System.out.println("Operation was successful: " + result);
    }
}
