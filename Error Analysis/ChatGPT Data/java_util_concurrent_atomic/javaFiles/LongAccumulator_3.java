import java.util.concurrent.atomic.LongAccumulator;

public class LongAccumulator_3 {
    public static void main(String[] args) {
        LongAccumulator accumulator = new LongAccumulator((x, y) -> x + y, 0);
        accumulator.accumulate(10);
        System.out.println("Current value: " + accumulator.get());
        
        // Reset the accumulator
        accumulator.reset();
        System.out.println("After reset: " + accumulator.get());
    }
}
