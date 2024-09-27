import java.util.concurrent.atomic.LongAccumulator;

public class LongAccumulator_1 {
    public static void main(String[] args) {
        LongAccumulator accumulator = new LongAccumulator((x, y) -> x + y, 0);

        // Using accumulate method to accumulate a value
        accumulator.accumulate(10);

        // Getting the current value accumulated
        long result = accumulator.get();
        System.out.println("Result: " + result);
    }
}
