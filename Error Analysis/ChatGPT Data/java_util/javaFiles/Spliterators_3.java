import java.util.ArrayList;
import java.util.Spliterator;

public class Spliterators_3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");

        Spliterator<String> spliterator = Spliterators.spliterator(list.iterator(), list.size(), Spliterator.ORDERED);
        
        System.out.println("Spliterator characteristics: " + spliterator.characteristics());
    }
}
