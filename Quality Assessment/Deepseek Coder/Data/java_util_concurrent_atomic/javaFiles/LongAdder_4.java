import java.util.concurrent.atomic.LongAdder;

public class LongAdder_4 {
    public static void main(String[] args) {
        LongAdder adder = new LongAdder();
        adder.increment();
        System.out.println(adder.longValue());  // Output: 1

        adder.reset();
        System.out.println(adder.longValue());  // Output: 0
    }
}
