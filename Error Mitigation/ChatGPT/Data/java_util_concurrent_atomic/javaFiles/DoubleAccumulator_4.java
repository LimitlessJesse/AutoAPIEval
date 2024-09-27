import java.util.concurrent.atomic.DoubleAccumulator;

public class DoubleAccumulator_4 {
    public static void main(String[] args) {
        DoubleAccumulator accumulator = new DoubleAccumulator((x, y) -> x + y, 0.0);
        accumulator.accumulate(10.5);
        accumulator.accumulate(5.5);
        
        double valueBeforeReset = accumulator.getThenReset();
        
        System.out.println("Value before reset: " + valueBeforeReset);
    }
}
