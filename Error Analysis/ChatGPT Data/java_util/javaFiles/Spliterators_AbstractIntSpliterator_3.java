import java.util.Spliterators;
import java.util.Spliterator;

public class Spliterators_AbstractIntSpliterator_3 {
    public static void main(String[] args) {
        int estimate = MySpliterator.estimateSize();
        System.out.println("Estimate size: " + estimate);
    }
    
    static class MySpliterator extends Spliterators.AbstractIntSpliterator {
        public MySpliterator(long size, int characteristics) {
            super(size, characteristics);
        }
    }
}
