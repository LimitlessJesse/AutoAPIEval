import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class Collections_2 {
    
    public static void reverse(List<?> list) {
        Collections.reverse(list);
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        
        System.out.println("Original list: " + list);
        
        reverse(list);
        
        System.out.println("Reversed list: " + list);
    }
}
