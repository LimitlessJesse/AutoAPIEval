import java.util.ArrayList;
import java.util.Collections;

public class Collections_5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Hello");
        
        int frequency = Collections.frequency(list, "Hello");
        System.out.println("Frequency of 'Hello' in the list: " + frequency);
    }
}
