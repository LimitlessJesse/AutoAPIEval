import java.util.concurrent.atomic.LongAccumulator;

public class LongAccumulator_2 {
    public static void main(String[] args) {
        LongAccumulator accumulator = new LongAccumulator(Long::max, 0);
        accumulator.accumulate(10);
        accumulator.accumulate(20);

        long result = accumulator.get();
        System.out.println("Result: " + result);
    }
}
