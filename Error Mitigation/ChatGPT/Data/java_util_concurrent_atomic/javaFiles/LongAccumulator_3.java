import java.util.concurrent.atomic.LongAccumulator;

public class LongAccumulator_3 {
    public static void main(String[] args) {
        LongAccumulator accumulator = new LongAccumulator((x, y) -> x + y, 0);
        accumulator.accumulate(5);
        System.out.println("Current value: " + accumulator.get());
        
        accumulator.reset();
        System.out.println("Value after reset: " + accumulator.get());
    }
}
