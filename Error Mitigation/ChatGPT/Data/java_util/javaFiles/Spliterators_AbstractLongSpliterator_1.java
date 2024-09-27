import java.util.Spliterators;

public class Spliterators_AbstractLongSpliterator_1 {
    public static void main(String[] args) {
        Spliterators.AbstractLongSpliterator spliterator = new Spliterators.AbstractLongSpliterator() {
            @Override
            public long estimateSize() {
                return 100; // Return an estimated size of 100
            }
        };

        long estimatedSize = spliterator.estimateSize();
        System.out.println("Estimated size: " + estimatedSize);
    }
}
