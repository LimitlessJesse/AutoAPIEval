import java.util.concurrent.atomic.LongAdder;

public class LongAdder_5 {
    public static void main(String[] args) {
        LongAdder adder = new LongAdder();
        adder.increment();
        adder.increment();
        adder.increment();
        long sum = adder.sumThenReset();
        System.out.println("Sum: " + sum);
    }
}
