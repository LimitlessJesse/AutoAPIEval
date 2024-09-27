import java.util.concurrent.atomic.DoubleAccumulator;

public class DoubleAccumulator_1 {
    public static void main(String[] args) {
        DoubleAccumulator accumulator = new DoubleAccumulator((x, y) -> x + y, 0.0);
        accumulator.accumulate(5.0);
        System.out.println(accumulator.get());
    }
}
