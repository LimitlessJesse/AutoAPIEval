import java.util.concurrent.atomic.DoubleAccumulator;

public class DoubleAccumulator_3 {
    public static void main(String[] args) {
        DoubleAccumulator accumulator = new DoubleAccumulator((x, y) -> x + y, 0.0);
        accumulator.accumulate(5.0);
        System.out.println("Current value: " + accumulator.get());
        
        accumulator.reset();
        System.out.println("Value after reset: " + accumulator.get());
    }
}
