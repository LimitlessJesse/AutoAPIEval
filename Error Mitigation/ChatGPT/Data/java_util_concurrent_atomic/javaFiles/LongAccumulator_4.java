import java.util.concurrent.atomic.LongAccumulator;

public class LongAccumulator_4 {
    public static void main(String[] args) {
        LongAccumulator accumulator = new LongAccumulator((x, y) -> x + y, 0);
        accumulator.accumulate(10);
        accumulator.accumulate(20);
        
        long valueBeforeReset = accumulator.getThenReset();
        System.out.println("Value before reset: " + valueBeforeReset);
    }
}
