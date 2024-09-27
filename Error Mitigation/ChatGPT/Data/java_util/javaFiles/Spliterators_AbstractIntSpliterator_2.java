import java.util.Spliterators;

public class Spliterators_AbstractIntSpliterator_2 {
    public static void main(String[] args) {
        Spliterators.AbstractIntSpliterator spliterator = new Spliterators.AbstractIntSpliterator() {
            @Override
            public long estimateSize() {
                return 100; // Return an estimated size of 100
            }
        };

        long estimatedSize = spliterator.estimateSize();
        System.out.println("Estimated size: " + estimatedSize);
    }
}
