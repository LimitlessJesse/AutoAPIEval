import java.util.Spliterators;

public class Spliterators_AbstractDoubleSpliterator_1 {
    public static void main(String[] args) {
        Spliterators.AbstractDoubleSpliterator doubleSpliterator = new Spliterators.AbstractDoubleSpliterator(0, 0) {
            @Override
            public long estimateSize() {
                return 100; // return an estimated size of 100 elements
            }
        };

        System.out.println("Estimated size: " + doubleSpliterator.estimateSize());
    }
}
