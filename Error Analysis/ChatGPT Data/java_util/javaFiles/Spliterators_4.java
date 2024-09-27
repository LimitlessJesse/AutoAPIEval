import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;

public class Spliterators_4 {
    public static void main(String[] args) {
        Iterator<String> iterator = Arrays.asList("Apple", "Banana", "Orange").iterator();
        Spliterator<String> sp = Spliterators.spliteratorUnknownSize(iterator, Spliterator.ORDERED);

        sp.forEachRemaining(System.out::println);
    }
}
