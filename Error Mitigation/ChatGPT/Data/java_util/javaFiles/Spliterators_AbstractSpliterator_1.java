import java.util.Spliterators;

public class Spliterators_AbstractSpliterator_1 {
    public static void main(String[] args) {
        Spliterators.AbstractSpliterator<String> spliterator = new Spliterators.AbstractSpliterator<String>(0, 0) {
            @Override
            public boolean tryAdvance(java.util.function.Consumer<? super String> action) {
                return false;
            }
        };
        
        long estimatedSize = spliterator.estimateSize();
        System.out.println("Estimated size: " + estimatedSize);
    }
}
