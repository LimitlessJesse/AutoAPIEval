import java.util.Spliterator;
import java.util.Spliterators;
import java.util.Iterator;

public class Spliterators_5 {
    public static void main(String[] args) {
        Iterator<Integer> iterator = new Iterator<Integer>() {
            int index = 0;
            Integer[] elements = {1, 2, 3, 4, 5};
            
            @Override
            public boolean hasNext() {
                return index < elements.length;
            }

            @Override
            public Integer next() {
                return elements[index++];
            }
        };

        Spliterator<Integer> spliterator = Spliterators.spliteratorUnknownSize(iterator, Spliterator.ORDERED);

        spliterator.forEachRemaining(System.out::println);
    }
}
