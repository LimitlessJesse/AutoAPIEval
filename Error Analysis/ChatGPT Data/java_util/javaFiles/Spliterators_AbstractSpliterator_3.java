import java.util.Spliterator;
import java.util.Spliterators.AbstractSpliterator;
import java.util.Spliterator.OfInt;
import java.util.Spliterator.OfLong;
import java.util.Spliterator.OfDouble;
import java.util.Spliterators;

public class Spliterators_AbstractSpliterator_3 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        
        // Creating a Spliterator for the array
        OfInt spliterator = Spliterators.spliterator(array, Spliterator.ORDERED);
        
        // Trying to split the Spliterator
        OfInt trySplitSpliterator = (OfInt) ((AbstractSpliterator.OfInt) spliterator).trySplit();
        
        while (spliterator.tryAdvance((int element) -> System.out.println("Element: " + element)));
        System.out.println("-----");
        while (trySplitSpliterator.tryAdvance((int element) -> System.out.println("TrySplit Element: " + element)));
    }
}
