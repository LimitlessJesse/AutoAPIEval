import java.util.ArrayList;

public class ArrayList_2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.trimToSize();
        System.out.println(list);
    }
}
