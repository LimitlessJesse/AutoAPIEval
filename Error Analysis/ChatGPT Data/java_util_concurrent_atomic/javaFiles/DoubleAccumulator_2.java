import java.util.concurrent.atomic.DoubleAccumulator;

public class DoubleAccumulator_2 {
    public static void main(String[] args) {
        DoubleAccumulator accumulator = new DoubleAccumulator((x, y) -> x + y, 0.0);
        accumulator.accumulate(10.5);
        System.out.println("Current Value: " + accumulator.get());
        
        // Reset the accumulator to its identity value
        accumulator.reset();
        System.out.println("Value after reset: " + accumulator.get());
    }
}
