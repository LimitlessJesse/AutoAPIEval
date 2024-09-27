import java.util.ArrayList;
import java.util.Collections;

public class Collections_5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("apple");
        
        int freq = Collections.frequency(list, "apple");
        System.out.println("Frequency of 'apple' in the list: " + freq);
    }
}
