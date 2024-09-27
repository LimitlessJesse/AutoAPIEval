import java.util.Objects;
import java.util.Comparator;

public class Objects_5 {
    public static void main(String[] args) {
        String a = "apple";
        String b = "banana";
        
        Comparator<String> comparator = Comparator.naturalOrder();
        
        System.out.println("Comparing using naturalOrder comparator: " + Objects.compare(a, b, comparator));
    }
}
