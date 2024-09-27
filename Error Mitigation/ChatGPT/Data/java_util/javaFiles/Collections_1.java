import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class Collections_1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        
        System.out.println("Before reversing: " + list);
        
        Collections.reverse(list);
        
        System.out.println("After reversing: " + list);
    }
}
