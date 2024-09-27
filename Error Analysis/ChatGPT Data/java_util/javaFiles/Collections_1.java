import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collections_1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        
        System.out.println("Before shuffling: " + numbers);
        
        Collections.shuffle(numbers);
        
        System.out.println("After shuffling: " + numbers);
    }
}
