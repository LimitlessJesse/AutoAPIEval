import java.util.Spliterators;

public class Spliterators_AbstractDoubleSpliterator_1 {
    public static void main(String[] args) {
        Spliterators.AbstractDoubleSpliterator spliterator = new Spliterators.AbstractDoubleSpliterator() {
            @Override
            public long estimateSize() {
                return 100; // Example estimate size
            }
        };

        long estimatedSize = spliterator.estimateSize();
        System.out.println("Estimated size: " + estimatedSize);
    }
}
