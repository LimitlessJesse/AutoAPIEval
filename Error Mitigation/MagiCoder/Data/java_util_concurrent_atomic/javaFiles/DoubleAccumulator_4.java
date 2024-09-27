import java.util.concurrent.atomic.DoubleAccumulator;

public class DoubleAccumulator_4 {
    public static void main(String[] args) {
        DoubleAccumulator accumulator = new DoubleAccumulator((left, right) -> left + right, 0.0);
        accumulator.accumulate(5.0);
        accumulator.accumulate(10.0);
        System.out.println("Current value: " + accumulator.get()); // Outputs: 15.0

        accumulator.reset();
        System.out.println("After reset: " + accumulator.get()); // Outputs: 0.0
    }
}
