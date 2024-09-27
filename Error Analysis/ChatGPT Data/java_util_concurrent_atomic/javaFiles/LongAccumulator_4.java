import java.util.concurrent.atomic.LongAccumulator;

public class LongAccumulator_4 {
    public static void main(String[] args) {
        LongAccumulator accumulator = new LongAccumulator((x, y) -> x + y, 0);
        accumulator.accumulate(5);
        System.out.println(accumulator.getThenReset());
    }
}
