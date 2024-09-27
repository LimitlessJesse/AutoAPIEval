import java.util.ArrayList;

public class ArrayList_4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Java");
        
        System.out.println("Before removing element at index 1: " + list);
        
        list.remove(1);
        
        System.out.println("After removing element at index 1: " + list);
    }
}
